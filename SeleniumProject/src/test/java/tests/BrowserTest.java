package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;  
import org.testng.annotations.Test;

public class BrowserTest {
  @Test
  public void InternetExplorer() {
	  System.setProperty("webdriver.ie.driver", "src/test/resources/driver/IEDriverServer.exe");  
	  WebDriver driver = new InternetExplorerDriver(); 
	  driver.get("https://www.javatpoint.com/maven-tutorial");
	  driver.close();
  }
}