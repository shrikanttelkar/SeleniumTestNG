package TestSuitexample;

import org.testng.annotations.Test;

public class ExampleTest2 {
  @Test
  public void f() {
	  System.out.println("from Test two by default enabled=true");
  }
  
  @Test(enabled=false)
  public void f2() {
	  System.out.println("enabled=Falsed ");
  }
}

/*  An example having two test classes, ExampleTest1 & ExampleTest2, to run together using Test Suite
 
 
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test1">
    <classes>
      <class name="TestSuitexample.ExampleTest1"/>
    </classes>
  </test> <!-- Test -->
  
  <test thread-count="5" name="Test2">
    <classes>
      <class name="TestSuitexample.ExampleTest2"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->

from Test one
from Test two by default enabled=true

===============================================
Suite
Total tests run: 2, Failures: 0, Skips: 0
===============================================


*/