package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import java.util.*;
import java.text.SimpleDateFormat;

import static org.junit.Assert.*;
public class DataHandlerTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
      DataHandler test = new DataHandler();
	 }

	 @Test
	  public void test02()  throws Throwable  {
      DataHandler test = new DataHandler("fileName");

      // // get the supported ids for GMT-08:00 (Pacific Standard Time)
      // String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);
      //   // create a Pacific Standard Time time zone
      // SimpleTimeZone pdt = new SimpleTimeZone(-8 * 60 * 60 * 1000, ids[0]);
      //
      // // set up rules for Daylight Saving Time
      // pdt.setStartRule(Calendar.APRIL, 1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);
      // pdt.setEndRule(Calendar.OCTOBER, -1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);
      //
      // GregorianCalendar time1 = new GregorianCalendar(pdt);
      // GregorianCalendar time2 = new GregorianCalendar(pdt);
      GregorianCalendar time1 = new GregorianCalendar();
      GregorianCalendar time2 = new GregorianCalendar();
      SimpleDateFormat format1 = new SimpleDateFormat("1999-1-1");
      SimpleDateFormat format2 = new SimpleDateFormat("2018-2-1");
      format1.setCalendar(time1);
      format2.setCalendar(time2);
      test.getApptRange(time1,time2);
      String result = format1.format(time1.getTime());
      System.out.println(result);

      result = format2.format(time2.getTime());
      System.out.println(result);

      assertEquals(test.save(),true);
      Appt myAppt = new Appt(2,2,2,2,2010,"test","testDescription","test@gmail.com");
      int[] recurrDays = {8,9};
      myAppt.setRecurrence(recurrDays, 5, 5, 5);
      assertEquals(test.saveAppt(myAppt),true);
    }
}
