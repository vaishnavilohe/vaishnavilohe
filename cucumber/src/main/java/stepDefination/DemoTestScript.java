package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoTestScript {
	
	@Given("^Launch the Browser as ChromeBrowser$")
	public void launch_the_Browser_as_ChromeBrowser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Hello ur in given annotation");
	}

	@When("^Launch the Application$")
	public void launch_the_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hello ur in when annotation");
	}

	@Then("^Pass the UserName and Password$")
	public void pass_the_UserName_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hello ur in then annotation");
	}

	@Then("^Login to Application after Clciks on Login Button$")
	public void login_to_Application_after_Clciks_on_Login_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hello ur in then annotation");
	}
	
	@Given("^I entered old password$")
	public void i_entered_old_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hello ur in Given2 annotation");
	}

	@When("^I entered new password and confirm password$")
	public void i_entered_new_password_and_confirm_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hello ur in When2 annotation");
	}

	@Then("^I should get a greeting message$")
	public void i_should_get_a_greeting_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hello ur in Then2 annotation");
	}





}
