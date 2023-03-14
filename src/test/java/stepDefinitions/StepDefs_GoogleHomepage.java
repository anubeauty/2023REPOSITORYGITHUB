package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs_GoogleHomepage {
	
	@Given("^I am a social networking site user$")
	public void i_am_a_social_networking_site_user() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("i am the user");
	}
	
	@When("^I enter user name as username1$")
	public void i_enter_user_name_as_username1() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		
		System.out.println("open site and enter username");
	}
	
	@And("^I enter password as password1$")
	public void i_enter_password_as_password1() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		
		System.out.println("enter password");
	}
	
	@Then("^I should be redirected to the home page of the site$")
	public void i_should_be_redirected_to_the_home_page_of_the_site() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		
		System.out.println("page redirected to home page");
	}

}
