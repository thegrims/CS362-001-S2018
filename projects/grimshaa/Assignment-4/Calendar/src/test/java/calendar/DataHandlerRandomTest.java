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

		try{
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =System.currentTimeMillis(); //10
		//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);

				DataHandler test = new DataHandler("fileName");

				elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
				}
			}catch(NullPointerException e){

			}
	 }
}
