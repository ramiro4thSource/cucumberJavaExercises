package steps;


import cucumber.api.java.en.When;
import pages.LandingPage;
import util.DriverFactory;



public class LandingPageStep extends DriverFactory{

	@When("^I decide to create an account$")
	public void she_chooses_to_sign_up() throws Throwable {
		new LandingPage(driver).I_decide_to_create_an_account();		
	}

}
