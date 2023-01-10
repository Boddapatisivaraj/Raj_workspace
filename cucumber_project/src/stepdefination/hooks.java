package stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class hooks {
	@Given("This is the first step")
	public void this_is_the_first_step() {
	   System.out.println("this is the first step");
	}
	@When("This is the second step")
	public void this_is_the_second_step() {
		System.out.println("this is the second step");

	}
	@Then("This is the last step")
	public void this_is_the_last_step() {
		System.out.println("this is the third step");
	}
	
	@Before
	public void beforescenario()
	{
		System.out.println("this the starting browser");
	}
	@After
	public void afterscenario()
	{
		System.out.println("this is the ending browser");
	}

}
