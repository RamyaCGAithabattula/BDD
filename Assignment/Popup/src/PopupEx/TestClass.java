package PopupEx;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestClass {

	@Given("^I should see a button named \"([^\"]*)\"$")
	public void i_should_see_a_button_named(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^I clicked on the Popup button$")
	public void i_clicked_on_the_Popup_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^I should navigate to other tab named \"([^\"]*)\"$")
	public void i_should_navigate_to_other_tab_named(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
}
