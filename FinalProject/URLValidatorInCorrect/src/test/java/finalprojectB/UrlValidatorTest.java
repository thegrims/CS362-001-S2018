
package finalprojectB;

import junit.framework.TestCase;

//You can use this as a skeleton for your 3 different test approach
//It is an optional to use this file, you can generate your own test file(s) to test the target function!
// Again, it is up to you to use this file or not!





public class UrlValidatorTest extends TestCase {


   public UrlValidatorTest(String testName) {
      super(testName);
   }



   public void testManualTest()
   {
//You can use this function to implement your manual testing

   }


   public void testYourFirstPartition()
   {
	    //You can use this function to implement your First Partition testing
	    // This partition tests overloading the constructor with strings list
      String[] schemes = {"http","https"};

      UrlValidator urlValidator = new UrlValidator(schemes);

      assertEquals(urlValidator.isValidScheme("http"),true);
      assertEquals(urlValidator.isValidScheme("https"),true);
      assertEquals(urlValidator.isValid("ftp://foo.bar.com/"),false);
      assertEquals(urlValidator.isValid(null),false);
      assertEquals(urlValidator.isValid(""),false);
      assertEquals(urlValidator.isValid("http://www.google.com/"),true);

   }

   public void testYourSecondPartition(){
		 //You can use this function to implement your Second Partition testing
		 // This partition tests overloading the constructor to allow all strings
     UrlValidator urlValidator = new UrlValidator(null,null,UrlValidator.ALLOW_ALL_SCHEMES);
     assertEquals(urlValidator.isValidScheme("http"),true);
     assertEquals(urlValidator.isValidScheme("https"),true);
     // assertEquals(urlValidator.isValid("ftp://foo.bar.com/"),true);
     assertEquals(urlValidator.isValid(null),false);
     assertEquals(urlValidator.isValid(""),false);
     assertEquals(urlValidator.isValid("http://www.google.com/"),true);
   }
   public void testYourThirdPartition(){
     // This partition tests using the default constructor
     UrlValidator urlValidator = new UrlValidator();
     assertEquals(urlValidator.isValidScheme("http"),true);
     assertEquals(urlValidator.isValidScheme("https"),true);
     assertEquals(urlValidator.isValid("ftp://foo.bar.com/"),true);
     assertEquals(urlValidator.isValid(null),false);
     assertEquals(urlValidator.isValid(""),false);
     assertEquals(urlValidator.isValid("http://www.google.com/"),true);
   }
   //You need to create more test cases for your Partitions if you need to

   public void testIsValid()
   {
	   //You can use this function for programming based testing

   }



}
