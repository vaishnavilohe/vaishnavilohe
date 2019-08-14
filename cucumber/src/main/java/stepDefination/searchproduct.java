package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.addtocart;
import pages.checkout;
import pages.loginpage;

public class searchproduct {
	public static WebDriver driver;
	addtocart ac;
	checkout co;
	loginpage po;

	@Given("^Chiya has registered for testme app$")
	public void chiya_has_registered_for_testme_app() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	}

	@When("^chiya search below product in search box$")
	public void chiya_search_below_product_in_search_box(DataTable productsdata) throws Throwable {
		List<String> productName = productsdata.asList();
		for(String product:productsName) {
			WebDriverWait
		}
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	   
	}

	@Then("^product should be add in the cart if available$")
	public void product_should_be_add_in_the_cart_if_available() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}
