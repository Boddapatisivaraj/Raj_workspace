package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Outline {

	@Given("there are {int} tables")
	public void there_are_tables(Integer int1) {
	    System.out.println("there are 7 tables");
	}
	@When("I have {int} tables")
	public void i_have_tables(Integer int1) {
	    System.out.println("I have 5 tables");

	}
	@Then("I should have {int} tables")
	public void i_should_have_tables(Integer int1) {
	    System.out.println("I should have 2 tables");

	}


}
