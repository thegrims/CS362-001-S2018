package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import java.util.*;

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

      // get the supported ids for GMT-08:00 (Pacific Standard Time)
      String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);
        // create a Pacific Standard Time time zone
      SimpleTimeZone pdt = new SimpleTimeZone(-8 * 60 * 60 * 1000, ids[0]);

      // set up rules for Daylight Saving Time
      pdt.setStartRule(Calendar.APRIL, 1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);
      pdt.setEndRule(Calendar.OCTOBER, -1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);

      GregorianCalendar time1 = new GregorianCalendar(pdt);
      GregorianCalendar time2 = new GregorianCalendar(pdt);
      // test.getApptRange(time1,time2);

      assertEquals(test.save(),true);
      // Appt myAppt = new Appt(2,2,2010,"test","testDescription","test@gmail.com");
      // saveAppt(myAppt);
    }
}
