package utils;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class somanytask {
	WebDriver driver;
  @Test
  public void launch() throws InterruptedException {
	  driver = DriverUtility.getDriver("chrome");
	  driver.manage().window().maximize();
	  driver.get("http://demowebshop.tricentis.com/");
	  Actions action = new Actions(driver);
	  action.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a"))).moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[2]/a"))).click().build().perform();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).sendKeys("computer");
	  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-14\"]"))).click().build().perform();
	  
	  
  }

}
