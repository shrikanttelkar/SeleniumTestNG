package Assertiondemo;

import org.apache.http.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTypesDemo {
  @Test
  public void fSoftAssert1() {
	  SoftAssert sa =new SoftAssert();
	  System.out.println("Soft assert started");
	  sa.assertTrue(false);
	  System.out.print("soft assert executed");
	  sa.assertAll();
  }
  
  @Test
  public void hardassert1()
  {
	  System.out.println("hard assert started");
	  Assert.assertTrue(false);
	  System.out.print("hard assert executed");
  }
}

/*-----output---
 * ----with sa.assertAll()----
 
Soft assert started
soft assert executedhard assert started

===============================================
Suite
Total tests run: 2, Failures: 2, Skips: 0
===============================================

-----without sa.assertAll()-----

Soft assert started
soft assert executedhard assert started

===============================================
Suite
Total tests run: 2, Failures: 1, Skips: 0
===============================================

 */
