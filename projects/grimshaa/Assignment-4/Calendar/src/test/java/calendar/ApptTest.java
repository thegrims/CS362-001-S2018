// package calendar;
// /**
//  *  This class provides a basic set of test cases for the
//  *  Appt class.
//  */
// import org.junit.Test;
//
// import static org.junit.Assert.*;
// public class ApptTest {
//     /**
//      * Test that the gets methods work as expected.
//      */
// 	 @Test
// 	  public void test01()  throws Throwable  {
// 			Appt test = new Appt(2,2,2010,"test","testDescription","test@gmail.com");
// 			assertEquals("blah",test.getStartMonth(),2);
// 			assertEquals(test.getStartDay(),2);
// 			assertEquals(test.getStartYear(),2010);
// 			assertEquals(test.getTitle(),"test");
// 			assertEquals(test.getDescription(),"testDescription");
// 			assertEquals(test.getEmailAddress(),"test@gmail.com");
//
// 			// test.setValid();
// 			//
// 			// assertEquals(test.getValid(),true);
// 	 }
//
// 	 @Test
// 	  public void test02()  throws Throwable  {
// 			// ----------------------------------------------------------
// 	    /**
// 	     * Constructs a new appointment that starts at a specific time on the
// 	     * date specified. The appointment is constructed with no recurrence
// 	     * information by default. To set recurrence information, construct the
// 	     * appointment and then call setRecurrence(...) method.
// 	     * @param startHour The hour that the appointment starts on. The hours are
// 	     *      numbered 0-23 to represent 12a.m. to 11pm on the day specified.
// 	     * @param startMinute The minute of the hour the appointment starts on.
// 	     * @param startDay The day of the month the appointment starts on.
// 	     * @param startMonth The month of the year the appointment starts on.
// 	     * @param startYear The year the appointment starts on.
// 	     * @param title The title or caption to give the appointment
// 	     * @param description The appointment's details
// 	     * @param emailAddress An e-mail address associated with the appointment
//
// 	     */
// 			Appt test = new Appt(2,2,2,2,2010,(String)null,(String)null,(String)null);
// 			// assertEquals(test.getStartHour(),2);
// 			assertEquals(test.getStartMinute(),2);
// 			assertEquals("blah",test.getStartMonth(),2);
// 			assertEquals(test.getStartDay(),2);
// 			assertEquals(test.getStartYear(),2010);
// 			assertEquals(test.getTitle(),"");
// 			assertEquals(test.getDescription(),"");
// 			assertEquals(test.getEmailAddress(),"");
//
// 			test.setValid();
// 			assertTrue(test.getValid());
//
// 			//------------------------------------
// 			test.setStartMonth(0);
// 			test.setValid();
// 			assertEquals(test.getValid(),false);
//
// 			test.setStartMonth(12);
// 			test.setValid();
// 			assertEquals(test.getValid(),false);
//
// 			test.setStartMonth(2);
// 			//------------------------------------
// 			test.setStartHour(-1);
// 			test.setValid();
// 			test.getValid();
//
// 			test.setStartHour(800);
// 			test.setValid();
// 			test.getValid();
// 			//------------------------------------
// 			test.setStartYear(-1);
// 			test.setValid();
// 			assertEquals(test.getValid(),false);
//
// 			test.setStartYear(0);
// 			test.setValid();
// 			assertEquals(test.getValid(),false);
//
// 			test.setStartYear(2010);
// 			//------------------------------------
// 			test.setStartMinute(-1);
// 			test.setValid();
// 			assertEquals(test.getValid(),false);
//
// 			test.setStartMinute(800);
// 			test.setValid();
// 			assertEquals(test.getValid(),false);
//
// 			test.setStartMinute(59);
// 			test.setValid();
// 			assertEquals(test.getValid(),true);
//
// 			test.setStartMinute(0);
// 			test.setValid();
// 			assertEquals(test.getValid(),true);
//
// 			//------------------------------------
//
// 			test.setStartDay(1);
// 			test.setValid();
// 			assertEquals(test.getValid(),true);
//
// 			test.setStartDay(2);
//
// 			// assertEquals(test.getValid(),true);
// 			assertEquals(test.isOn(2,2,2010),true);
// 			assertEquals(test.isOn(2,2,2009),false);
// 			assertEquals(test.hasTimeSet(),true);
// 			System.out.println(test.toString());
// 			assertEquals(test.toString().contains("am"),true);
// 			assertEquals(test.toString().contains("1:"),true);
// 	 }
// }