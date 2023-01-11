package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Outline1 {
	@Given("there are {int} apples")
	public void there_are_apples(Integer int1) {
	    System.out.println("there are 15 apples");
	}
	@When("I eat {int} apples")
	public void i_eat_apples(Integer int1) {
	   System.out.println("I eat  5 apples");
	}
	@Then("I should have {int} apples")
	public void i_should_have_apples(Integer int1) {
	   System.out.println("I should have 10 apples");
	}
}
