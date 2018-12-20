package DependencyDemo;

import org.testng.annotations.Test;

public class DependsDemo {
  /*  --------------without dependency------------
  @Test
  public void f1() {
	  System.out.println("case 1");	  
  }
  
  @Test
  public void f2() {
	  System.out.println("case 2");	  
  }*/
  
  /*case 1
case 2
PASSED: f1
PASSED: f2
===============================================
    Default test
    Tests run: 2, Failures: 0, Skips: 0
===============================================
*/
  
	//----------with dependency----------------
	 @Test(dependsOnMethods={"f2"})
	  public void f1() {
		  System.out.println("case 1");	  
	  }
	  
	  @Test
	  public void f2() {
		  System.out.println("case 2");	  
	  }
	  
	  /*
case 2
case 1
PASSED: f2
PASSED: f1

===============================================
    Default test
    Tests run: 2, Failures: 0, Skips: 0
===============================================
	   * 
	   */
}

