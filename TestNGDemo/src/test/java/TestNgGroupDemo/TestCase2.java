package TestNgGroupDemo;

import org.testng.annotations.Test;

public class TestCase2 {
  @Test (groups={"G1","G2"})
  public void m2() {
	  System.out.println("from G1 and G2");
  }
}

/*--------------------testing.xml-------------------------
 * <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test">
  <groups>
  <run>
  <include name="G1"> </include>  <!-- output= G1 --> 
  <exclude name="G2"></exclude>
   </run>
  </groups>
    <classes>
      <class name="TestNgGroupDemo.TestCase1"/>
      <class name="TestNgGroupDemo.TestCase2"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
 */
