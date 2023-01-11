package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClassS {
	@Given("there are {int} tables1")
	public void there_are_tables1(Integer int1) {
	    System.out.println("there are 7 tables1");
	}
	@When("I have {int} tables1")
	public void i_have_tables1(Integer int1) {
	   System.out.println("I have 5 tables1");
	}
	@Then("I should have {int} tables1")
	public void i_should_have_tables1(Integer int1) {
	   System.out.println("I should have 2 tables1");
	}

	@Given("there are {int} apples2")
	public void there_are_apples2(Integer int1) {
	   System.out.println("there are 15 apples2");
	}
	@When("I eat {int} apples2")
	public void i_eat_apples2(Integer int1) {
	    System.out.println("I eat 5 apples2");
	}
	@Then("I should have {int} apples2")
	public void i_should_have_apples2(Integer int1) {
	   System.out.println("I should have 10 apples2");
	}


}