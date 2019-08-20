package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testrowscoloumns {
	
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver = DriverUtility.getDriver("chrome");
	  driver.manage().window().maximize();
	  driver.get("http://the-internet.herokuapp.com/tables");
	  Thread.sleep(2000);
	  WebElement table = driver.findElement(By.id("table1"));
	  List<WebElement> rows = table.findElements(By.tagName("tr"));
	  for(WebElement row : rows) {
		  List<WebElement> cols =row.findElements(By.tagName("td"));
		  for(WebElement cellData : cols) {
			  System.out.println(cellData.getText());
		  }
		  Thread.sleep(2000);
		  
	  }
	  
  }
}
