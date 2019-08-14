package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoTestScript3 {

	WebDriver driver;
	@Given("^Launch the Browser$")
	public void launch_the_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Hello ur in the Given Annotation");
	}

	@When("^Pass the UserName and Password and Navigate to login page$")
	public void pass_the_UserName_and_Password_and_Navigate_to_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("WebDriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		  driver.findElement(By.linkText("Log in")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("Email")).sendKeys("vlohe@gmail.com");
		  driver.findElement(By.id("Password")).sendKeys("1234567");
		  driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.className("ico-logout")).click();
		  
	}

	@Then("^User should able to login to application$")
	public void user_should_able_to_login_to_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hello ur in the Then Annotation");
	}


}
