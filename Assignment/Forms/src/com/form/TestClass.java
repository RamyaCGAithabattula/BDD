package com.form;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestClass {

	@Given("^I should fill the form$")
	public void i_should_fill_the_form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^I should fill the form and click on submit button$")
	public void i_should_fill_the_form_and_click_on_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@Then("^The form should be submitted$")
	public void the_form_should_be_submitted() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
}
