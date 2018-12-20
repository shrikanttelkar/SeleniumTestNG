package packageone;

/*Before running this file convert it in to TestNG then existing testng.xml will updated. 
 * finaly run as testNG
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest2 {
	
  
 // public WebDriver driver=new ChromeDriver();  
  @Test
  public void testCase1() {
     System.out.println("in test case 1");
     //System.setProperty("webdriver.chrome.driver","E:\\SFT_YK\\chromedriver_win32\\chromedriver.exe");
    // driver.get("http://www.google.com");
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
