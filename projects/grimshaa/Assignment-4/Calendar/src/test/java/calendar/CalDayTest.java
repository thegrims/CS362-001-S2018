package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;
public class CalDayTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
      CalDay test = new CalDay();
      assertEquals(test.isValid(),true);

	 }

	 @Test
	  public void test02()  throws Throwable  {
      // get the supported ids for GMT-08:00 (Pacific Standard Time)
      String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);
        // create a Pacific Standard Time time zone
      SimpleTimeZone pdt = new SimpleTimeZone(-8 * 60 * 60 * 1000, ids[0]);

      // set up rules for Daylight Saving Time
      pdt.setStartRule(Calendar.APRIL, 1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);
      pdt.setEndRule(Calendar.OCTOBER, -1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);

      GregorianCalendar time1 = new GregorianCalendar(pdt);

      CalDay test = new CalDay(time1);

      assertEquals(test.isValid(),true);
			test.iterator();
			System.out.println(test.getFullInfomrationApp(test));
			/**
			 * Constructs a new appointment that starts at a specific time on the
			 * date specified. The appointment is constructed with no recurrence
			 * information by default. To set recurrence information, construct the
			 * appointment and then call setRecurrence(...) method.
			 * @param startHour The hour that the appointment starts on. The hours are
			 *      numbered 0-23 to represent 12a.m. to 11pm on the day specified.
			 * @param startMinute The minute of the hour the appointment starts on.
			 * @param startDay The day of the month the appointment starts on.
			 * @param startMonth The month of the year the appointment starts on.
			 * @param startYear The year the appointment starts on.
			 * @param title The title or caption to give the appointment
			 * @param description The appointment's details
			 * @param emailAddress An e-mail address associated with the appointment

			 */
			// invalid appointment
			Appt myAppt2 = new Appt(12,40,12,12,2010,"test","testDescription","test@gmail.com");
			myAppt2.setValid();
			assertEquals(myAppt2.getValid(),false);
			test.addAppt(myAppt2);
			System.out.println(test.getFullInfomrationApp(test));

			// valid appointment
			Appt myAppt = new Appt(2,40,2,2,2010,"test","testDescription","test@gmail.com");
			myAppt.setValid();
			assertEquals(myAppt.getValid(),true);
			test.addAppt(myAppt);
			System.out.println(test.getFullInfomrationApp(test));

			// valid appointment
			Appt myAppt3 = new Appt(0,1,1,1,2010,"test","testDescription","test@gmail.com");
			myAppt3.setValid();
			assertEquals(myAppt3.getValid(),true);
			test.addAppt(myAppt3);
			System.out.println(test.getFullInfomrationApp(test));

			System.out.println(test.getAppts().size());
			for (int i = 0; i < test.getAppts().size(); i++) {
				// Appt testA = test.getAppts().get(i);
				System.out.println("hour"+test.getAppts().get(i).getStartHour());
				System.out.println(test.getAppts().get(i).getStartMinute());
			}

      test.iterator();
      test.toString();
      test.getFullInfomrationApp(test);
			test.getSizeAppts();

    }
		@Test
		 public void test03()  throws Throwable  {
			 GregorianCalendar time1 = new GregorianCalendar(1999,1,1);
			 CalDay test = new CalDay(time1);
		}
}
