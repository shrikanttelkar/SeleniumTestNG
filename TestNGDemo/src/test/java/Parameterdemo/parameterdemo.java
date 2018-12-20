package Parameterdemo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class parameterdemo {
  @Test
  @Parameters("browser")
  public void f(@Optional("hello")String browser) {
	  if (browser.equals("firefox"))
	  {
		  System.out.print("firefox opening");
	  }
	  else if (browser.equals("chrome"))
	  {
		  System.out.print("chrome opening");
	  }
  }
}
