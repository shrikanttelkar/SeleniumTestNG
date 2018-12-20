package Assertiondemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class assertdemo {
  @Test
  public void f()throws Exception {
	  System.setProperty("webdriver.chrome.driver","E:\\SFT_YK\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.co.in");	  
		String at="Googlee";
		Assert.assertEquals(driver.getTitle(), at,"not equal");
  }
}

/*
 * Starting ChromeDriver 2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a) on port 2949
Only local connections are allowed.
Nov 28, 2018 11:22:50 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS

PASSED: f

===============================================
    Default test
    Tests run: 1, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 1, Failures: 0, Skips: 0
===============================================
 */
