package com.hellounit;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestClass {

	@Given("^I should see the html styles and colors$")
	public void i_should_see_the_html_styles_and_colors() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@When("^I runned the java class$")
	public void i_runned_the_java_class() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^I should get some html syles and different colors$")
	public void i_should_get_some_html_syles_and_different_colors() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}
}
