package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_withparameters {
	@Given("site url as {string}")
	public void site_url_as(String string) {
	    System.out.println("Url entered --->"+string);
	}
	@Given("click on Register with us")
	public void click_on_register_with_us() {
	    System.out.println("create registration button clicked");
	}
	@When("user enter valid mobilenumber {string}")
	public void user_enter_valid_mobilenumber(String string) {
	   System.out.println("mobile number entered --->"+string);
	}
	@When("Enter firstname as {string}")
	public void enter_firstname_as(String string) {
		System.out.println("firstname entered --->"+string);
	}
	@When("Enter Surname as {string}")
	public void enter_surname_as(String string) {
		System.out.println("surname entered --->"+string);
	}
	@When("Enter age as {int}")
	public void enter_age_as(Integer int1) {
	   System.out.println("age entered is --->"+int1);
	}
	@When("click on Register")
	public void click_on_register() {
	   System.out.println("Registered button clicked");
	}
	@Then("verify Sucessful message")
	public void verify_sucessful_message() {
	    System.out.println("Error message displayed");
	}



}
