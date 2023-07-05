package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	@Given("user calculted {int}\\/{int}")
	public void user_calculted(Integer int1, Integer int2) {
	    int i = 1/0;
	    System.out.println(i);
	}
	
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	    
	}

	@When("user enters the username and password")
	public void user_enters_the_username_and_password() {
	    
	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
	    
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    
	}

	@When("user enters the invalid username and password")
	public void user_enters_the_invalid_username_and_password() {
	    
	}

	@Then("error message is displayed - Invalid Credentials")
	public void error_message_is_displayed_Invalid_Credentials() {
	    
	}


}	
