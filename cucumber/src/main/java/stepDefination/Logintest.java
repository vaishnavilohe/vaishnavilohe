package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.addtocart;
import pages.checkout;
import pages.loginpage;

public class Logintest {
	public static WebDriver driver;
	addtocart ac;
	checkout co;
	loginpage po;
	
	@Given("^Navigate to Home Page$")
	public void navigate_to_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   
	}

	@When("^User enter username and password$")
	public void user_enter_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		po = new loginpage(driver);
		po.login.click();
		po.usename.sendKeys("vlohe@gmail.com");
		po.password.sendKeys("1234567");
		po.loginbutton.click();   
	}

	@Then("^user logged in Successfully$")
	public void user_logged_in_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	@Given("^chiya selected product$")
	public void chiya_selected_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions 
	    System.out.println("1");
        ac = new addtocart(driver);
		ac.apprealshoes.click();
		ac.casual.click();
		ac.quantity.sendKeys("1");
		ac.addtocart.click();
		ac.cart.click();
		
	}

	@When("^chiya increased product count$")
	public void chiya_increased_product_count() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		 System.out.println("2");
		 co =new checkout(driver);
		 co.termclick.click();
			co.checkout.click();
			co.continue1.click();
			co.continue2.click();
			co.continue3.click();
			co.continue4.click();
			co.continue5.click();
			co.confirm.click();
			co.logout.click();
	}
	
	@When("^proceed to chckout$")
	public void proceed_to_chckout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("5");
	}

	@When("^change the shipping address to address \"([^\"]*)\"$")
	public void change_the_shipping_address_to_address(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("3");
	}

	@Then("^The product should be delivered$")
	public void the_product_should_be_delivered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("4");
	}

}
