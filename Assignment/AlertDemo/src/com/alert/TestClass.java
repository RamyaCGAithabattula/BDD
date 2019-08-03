package com.alert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestClass {

	@Given("^It shows a show alert box button$")
	public void it_shows_a_show_alert_box_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^I will click on the show alert box$")
	public void i_will_click_on_the_show_alert_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^I should see a popup as \"([^\"]*)\"$")
	public void i_should_see_a_popup_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}
}
