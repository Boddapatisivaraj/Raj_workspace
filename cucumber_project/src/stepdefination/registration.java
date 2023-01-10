package stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registration {
	@When("user enter valid mobilenumber")
	public void user_enter_valid_mobilenumber() {
	   System.out.println("valid mobile number entered");
	}
	@When("wait for OTP")
	public void wait_for_otp() {
	   System.out.println("Timeout for OTP to generate");
	}
	@When("Enter valid OTP")
	public void enter_valid_otp() {
	    System.out.println("OTP is entered");
	}
	@When("Click on Create Account Button")
	public void click_on_create_account_button() {
	    System.out.println("create account button clicked");
	}
	@Then("Verify Registration successful message displayed")
	public void verify_registration_successful_message_displayed() {
	   System.out.println("message displayed");
	}



}
