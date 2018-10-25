package steps;

import java.net.URI;

import cucumber.api.java.en.Then;
import junit.framework.Assert;
import pages.SuccesRegisterPage;
import util.DriverFactory;

public class SuccesPageStep extends DriverFactory{
	
	@Then("^I should get at ([^\\\"]*)$")
	public void setup(String succesPage) throws Throwable {
		URI uri = new URI(succesPage);
		URI uriResult = new URI(new SuccesRegisterPage(driver).isSuccesPage());
		String[] segments = uri.getPath().split("/");
		String stringDesired = segments[segments.length-1];
		segments = uriResult.getPath().split("/");
		String stringGotten = segments[segments.length-1];				
		Assert.assertEquals(stringDesired, stringGotten);
	}
}
