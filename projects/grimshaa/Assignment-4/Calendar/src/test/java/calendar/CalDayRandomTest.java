package calendar;

// import java.util.Calendar.*;
// import java.util.Random.*;
//
// import java.util.GregorianCalendar;
//
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;


/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {

		private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
		private static final int NUM_TESTS=100;

    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {

			long startTime = Calendar.getInstance().getTimeInMillis();
			long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

			System.out.println("Start testing...");
			System.out.println("Start testing...");
      // get the supported ids for GMT-08:00 (Pacific Standard Time)
      String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);
        // create a Pacific Standard Time time zone
      SimpleTimeZone pdt = new SimpleTimeZone(-8 * 60 * 60 * 1000, ids[0]);

      // set up rules for Daylight Saving Time
      pdt.setStartRule(Calendar.APRIL, 1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);
      pdt.setEndRule(Calendar.OCTOBER, -1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);


			GregorianCalendar time1 = new GregorianCalendar(pdt);
			CalDay test = new CalDay(time1);

			try{
				for (int iteration = 0; elapsed < TestTimeout; iteration++) {
					long randomseed =System.currentTimeMillis(); //10
		//			System.out.println(" Seed:"+randomseed );
					Random random = new Random(randomseed);




					int startHour=ValuesGenerator.getRandomIntBetween(random, -5, 25);
					int startMinute=ValuesGenerator.getRandomIntBetween(random, -5, 65);
					int startDay=ValuesGenerator.getRandomIntBetween(random, -5, 35);
					int startMonth=ValuesGenerator.getRandomIntBetween(random, -5, 15);
					int startYear=ValuesGenerator.getRandomIntBetween(random, -5, 100);
					String title="Birthday Party";
					String description="This is my birthday party.";
					String emailAddress="xyz@gmail.com";

					//Construct a new Appointment object with the initial data
							Appt appt2 = new Appt(startHour,
											 startMinute ,
											 startDay ,
											 startMonth ,
											 startYear ,
											 title,
											description,
											emailAddress);
					appt2.setValid();

					test.addAppt(appt2);

					startHour=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				  startMinute=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				  startDay=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				  startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				  startYear=ValuesGenerator.getRandomIntBetween(random, 2018, 2018);
				  title="Birthday Party";
				  description="This is my birthday party.";
				  emailAddress="xyz@gmail.com";

					//Construct a new Appointment object with the initial data
						 Appt appt = new Appt(startHour,
											startMinute ,
											startDay ,
											startMonth ,
											startYear ,
											title,
										 description,
										 emailAddress);

					appt.setValid();

					test.addAppt(appt);

					elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
 			        if((iteration%10000)==0 && iteration!=0 )
 			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
				}
			}catch(NullPointerException e){

			}
	 }
}
