package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginpage {
	WebDriver driver;
  @Test
  public void launchtest() {
	  
	  driver= DriverUtility.getDriver("chrome");
	  driver.get("http://demowebshop.tricentis.com/login");
	  Assert.assertNotEquals(driver.getTitle(),"Demo Web Shop");
	  driver.findElement(By.linkText("Log in")).click();
	  driver.findElement(By.id("Email")).sendKeys("vlohe@gmail.com");
	  driver.findElement(By.id("Password")).sendKeys("1234567");
	  driver.findElement(By.linkText("Log in")).click();
	  driver.close();
	  
  }
}
