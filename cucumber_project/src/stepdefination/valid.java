package stepdefination;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class valid {

	@Given("Open the chrome and start application")
	public void open_the_chrome_and_start_application() {
	    System.out.println("open the facebook and start application");
	}
	@When("I enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password() {
	   System.out.println("enter the valid username and password ");
	}
	@Then("user should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
		System.out.println("user should be able to login successful");
	}
}
