package utils;

import java.util.*;
//import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class assignment2 {
	WebDriver driver;
  @Test
  public void switchToWindow() {
	  driver = DriverUtility.getDriver("chrome");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
	  String parentWindowHandle = driver.getWindowHandle();
	  try {
		  driver.findElement(By.xpath("//button[@onclick =\"if (!window.__cfRLUnblockHandlers) return false; newBrwTab()\"]")).click();
	  } catch (Exception ex) {
		  ex.printStackTrace();
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[@onclick =\"if (!window.__cfRLUnblockHandlers) return false; newBrwTab()\"]")));
	  }
	  Set<String> winHandles = driver.getWindowHandles();
	  for (String handle : winHandles) {
		  if(!handle.equals(parentWindowHandle)) {
			  driver.switchTo().window(handle);
			  driver.manage().window().maximize();
			  System.out.println("Title of the new window: "+ driver.getTitle());
			  System.out.println("Closing the new window...");
			  driver.close();
		  }
	  }
	  driver.switchTo().window(parentWindowHandle);
	  driver.close();
	  
  }

}
