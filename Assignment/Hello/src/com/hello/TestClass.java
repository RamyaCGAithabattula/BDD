package com.hello;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestClass {

	@Given("^I should see the word \"([^\"]*)\"$")
	public void i_should_see_the_word(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^I runned the class$")
	public void i_runned_the_class() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^It should show the given context$")
	public void it_should_show_the_given_context() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
}
