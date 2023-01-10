package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
public class multipledata {
	@Given("User is on Page")
	public void user_is_on_page() {
		System.out.println("user is on the page");
	}
	@When("User cursor Navigate to LogIn Page")
	public void user_cursor_navigate_to_log_in_page() {
	   System.out.println("user cursor navigated to page");
	}
	@When("User entered the Credentials to LogIn")
	public void user_entered_the_credentials_to_log_in(DataTable dataTable) {
	   String UID7= dataTable.row(0).get(0);
	   String PWD7= dataTable.row(0).get(1);
	   System.out.println(UID7+" "+PWD7);
	}
	@Then("Message displayed Login Successful")
	public void message_displayed_login_successful() {
	    
	}
}
