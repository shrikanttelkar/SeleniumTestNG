package TestNgGroupDemo;

import org.testng.annotations.Test;

public class TestCase1 {
  @Test (groups={"G1"})
  public void m1() {
	  System.out.println("G1");
  }
}
