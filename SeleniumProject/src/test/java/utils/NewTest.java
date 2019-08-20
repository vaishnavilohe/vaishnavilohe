package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DriverUtility;


public class NewTest {
	WebDriver driver;
	
  @Test
  public void launchBrowserTest() {
	  
	  driver = DriverUtility.getDriver("chrome");
	  driver.get("https://www.testandquiz.com/selenium/testing.html");
	  // WebElement = driver.findElement(By.linkText("This is a link")).click();
	  driver.navigate().back();
	  driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
	
	  driver.close();
  }


}

