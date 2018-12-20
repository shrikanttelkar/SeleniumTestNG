package Dataproviderdemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
  @Test(dataProvider="getdata")
  public void f(String p,String q) {
	  System.out.println("P="+p);
	  System.out.println("Q="+q);
  }
  @DataProvider(name="getdata")
  public Object[][] getdata()
  {
	  Object data[][]=new Object[2][2];
	  data [0][0] = "FirstUid";
	  data [0][1] = "FirstPWD";
	  
	  data[1][0] = "SecondUid";
	  data[1][1] = "SecondPWD";
	  
	  return data;
  }
}

/*---------output---------
 * P=FirstUid
Q=FirstPWD
P=SecondUid
Q=SecondPWD
PASSED: f("FirstUid", "FirstPWD")
PASSED: f("SecondUid", "SecondPWD")

===============================================
    Default test
    Tests run: 2, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 2, Failures: 0, Skips: 0
===============================================

-------------------xml file----------------
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test">
    <classes>
      <class name="Dataproviderdemo.dataprovider"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
 */
