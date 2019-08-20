package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class testselectcommand {
	WebDriver driver;
  @Test
  public void selecttest() {
	  
	  driver = DriverUtility.getDriver("chrome");
	  driver.get("https://www.testandquiz.com/selenium/testing.html");
	  Select dropdown =new Select(driver.findElement(By.id("Drop down")));
	  dropdown.selectByVisibleText("Manual Testing");
	  driver.close();
  }
}
