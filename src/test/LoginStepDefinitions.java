package test;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions {
	
	@Given("^A user is on Demoqa\\.com$")
	public void a_user_is_on_Demoqa_com() throws Throwable {
	   System.out.println("User is on Demoqa.com");
	}

	@When("^user clicks on my MyAccount link$")
	public void user_clicks_on_my_MyAccount_link() throws Throwable {
		System.out.println("User clicks on MyAccount link");
	   // throw new PendingException();
	}

	@Then("^user is taken to login page$")
	public void user_is_taken_to_login_page() throws Throwable {
		System.out.println("User is taking to login page");
	   // throw new PendingException();
	}

	@When("^User enters a valid user name and password$")
	public void user_enters_a_valid_user_name_and_password() throws Throwable {
		System.out.println("User enteres a valid username and password");
	   // throw new PendingException();
	}

	@Then("^user is able to login successfully$")
	public void user_is_able_to_login_successfully() throws Throwable {
		System.out.println("User is able to login successfully");
	   // throw new PendingException();
	}



	
	

}
