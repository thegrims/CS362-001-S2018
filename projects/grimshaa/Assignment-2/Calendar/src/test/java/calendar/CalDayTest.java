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

      Appt myAppt = new Appt(2,2,2,2,2010,"test","testDescription","test@gmail.com");
      assertEquals(myAppt.getValid(),true);
      test.addAppt(myAppt);

      test.iterator();
      test.toString();
      test.getFullInfomrationApp(test);
    }
}
