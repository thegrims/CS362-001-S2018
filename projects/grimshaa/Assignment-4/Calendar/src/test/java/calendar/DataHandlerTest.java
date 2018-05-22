// package calendar;
// /**
//  *  This class provides a basic set of test cases for the
//  *  Appt class.
//  */
// import org.junit.Test;
//
// import java.util.*;
// import java.text.SimpleDateFormat;
//
// import static org.junit.Assert.*;
// public class DataHandlerTest {
//     /**
//      * Test that the gets methods work as expected.
//      */
// 	 @Test
// 	  public void test01()  throws Throwable  {
//       DataHandler test = new DataHandler();
// 	 }
//
// 	 @Test
// 	  public void test02()  throws Throwable  {
//       DataHandler test = new DataHandler("fileName");
//
//       // // get the supported ids for GMT-08:00 (Pacific Standard Time)
//       // String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);
//       //   // create a Pacific Standard Time time zone
//       // SimpleTimeZone pdt = new SimpleTimeZone(-8 * 60 * 60 * 1000, ids[0]);
//       //
//       // // set up rules for Daylight Saving Time
//       // pdt.setStartRule(Calendar.APRIL, 1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);
//       // pdt.setEndRule(Calendar.OCTOBER, -1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);
//       //
//       // GregorianCalendar time1 = new GregorianCalendar(pdt);
//       // GregorianCalendar time2 = new GregorianCalendar(pdt);
//       GregorianCalendar time1 = new GregorianCalendar(1999,1,1);
//       GregorianCalendar time2 = new GregorianCalendar(2018,2,2);
//       // SimpleDateFormat format1 = new SimpleDateFormat("1999-1-1");
//       // SimpleDateFormat format2 = new SimpleDateFormat("2018-2-1");
//       // format1.setCalendar(time1);
//       // format2.setCalendar(time2);
//
//       // String result = format1.format(time1.getTime());
//       // System.out.println(time1);
//       // assertTrue(!time2.before(time1));
//
//       // result = format2.format(time2.getTime());
//       // System.out.println(result);
//
//       assertEquals(test.save(),true);
//       Appt myAppt = new Appt(2,2,2,2,2010,"test","testDescription","test@gmail.com");
//       int[] recurDaysArr4={2,3,4};
//       myAppt.setRecurrence( recurDaysArr4, Appt.RECUR_BY_WEEKLY, 3, Appt.RECUR_NUMBER_FOREVER);
//       System.out.println(myAppt.getRecurBy());
// 			test.getApptRange(time1,time2);
//
//       myAppt.setRecurrence( recurDaysArr4, Appt.RECUR_BY_MONTHLY, 3, Appt.RECUR_NUMBER_FOREVER);
//       System.out.println(myAppt.getRecurBy());
// 			test.getApptRange(time1,time2);
//
//       myAppt.setRecurrence( recurDaysArr4, Appt.RECUR_BY_YEARLY, 3, Appt.RECUR_NUMBER_FOREVER);
//       System.out.println(myAppt.getRecurBy());
//
//       assertEquals(test.deleteAppt(myAppt),false);
//
//       assertEquals(test.saveAppt(myAppt),true);
//
//       test.getApptRange(time1,time2);
//
//       assertEquals(test.deleteAppt(myAppt),true);
//     }
// }
