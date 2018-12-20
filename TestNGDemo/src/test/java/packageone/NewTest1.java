package packageone;

/*Before running this file convert it in to TestNG then existing testng.xml will updated. 
 * finaly run as testNG
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1 {
	
	WebDriver driver;
	String baseurl="https://www.google.com";
	
  @Test
  public void f() {
	  driver.findElement(By.name("q")).sendKeys("Hi");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","E:\\SFT_YK\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();	  
	  driver.get(baseurl);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
