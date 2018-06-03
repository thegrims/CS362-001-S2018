package calendar;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;


/**
 * Random Test Generator  for DataHandler class.
 */

public class DataHandlerRandomTest {

		private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
		private static final int NUM_TESTS=100;

    /**
     * Generate Random Tests that tests DataHandler Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {

		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		System.out.println("Start testing...");

    GregorianCalendar time1 = new GregorianCalendar(1999,1,1);
    GregorianCalendar time2 = new GregorianCalendar(2018,2,2);

		Appt[] list = new Appt[5];
		try{
			DataHandler test = new DataHandler("fileName");

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
				test.saveAppt(appt2);
				test.deleteAppt(appt2);

				for (int i=0; i<5; i++){
					startHour=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					startMinute=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					startDay=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					startYear=ValuesGenerator.getRandomIntBetween(random, 2018, 2018);
					title="Birthday Party";
					description="This is my birthday party.";
					emailAddress="xyz@gmail.com";

					//Construct a new Appointment object with the initial data
					list[i]=(new Appt(startHour,
											 startMinute ,
											 startDay ,
											 startMonth ,
											 startYear ,
											 title,
											 description,
											 emailAddress));

					list[i].setValid();

					test.saveAppt(list[i]);
					test.getApptRange(time1,time2);
				}

				for (int i=0; i<5; i++){
					test.deleteAppt(list[i]);
				}
				elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
				}

			}catch(NullPointerException e){

			}
	 }
}
