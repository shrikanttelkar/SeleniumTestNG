package packageone;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HelloWorld {
	// test case 1
	   @Test
	   public void testCase1() {
	      System.out.println("in test case 1");
	      try {
			Thread.sleep(3000);
			System.out.println("in sleep");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }

	   // test case 2
	   @Test
	   public void testCase2() {
	      System.out.println("in test case 2");
	   }

	   @BeforeMethod
	   public void beforeMethod() {
	      System.out.println("in beforeMethod");
	   }

	   @AfterMethod
	   public void afterMethod() {
	      System.out.println("in afterMethod");
	   }

	   @BeforeClass
	   public void beforeClass() {
	      System.out.println("in beforeClass");
	   }

	   @AfterClass
	   public void afterClass() {
	      System.out.println("in afterClass");
	   }

	   @BeforeTest
	   public void beforeTest() {
	      System.out.println("in beforeTest");
	   }

	   @AfterTest
	   public void afterTest() {
	      System.out.println("in afterTest");
	   }

	   @BeforeSuite
	   public void beforeSuite() {
	      System.out.println("in beforeSuite");
	   }

	   @AfterSuite
	   public void afterSuite() {
	      System.out.println("in afterSuite");
	   }
}

/*  testing.xml
 
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test">
    <classes>
      <class name="packageone.HelloWorld"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->

in beforeSuite
in beforeTest
in beforeClass
in beforeMethod
in test case 1
in sleep
in afterMethod
in beforeMethod
in test case 2
in afterMethod
in afterClass
in afterTest
in afterSuite

===============================================
Suite
Total tests run: 2, Failures: 0, Skips: 0
===============================================


*/