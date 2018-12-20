package TestngExceptionDemo;

import org.testng.annotations.Test;

public class TestException {
 /* @Test
  public void f() {
	  System.out.println("hello");
	  int a=5/0;      
	  
	  /*hello
	  FAILED: f
	  java.lang.ArithmeticException: / by zero
	  Tests run: 1, Failures: 1, Skips: 0
	  */   
	
	@Test(expectedExceptions=ArithmeticException.class)
	 public void f() {
		  System.out.println("hello");
		  int a=5/0; 
		  
		  /*
		   * hello
             PASSED: f
            ===============================================
               Default test
               Tests run: 1, Failures: 0, Skips: 0
            ===============================================
		   */
  }
}
