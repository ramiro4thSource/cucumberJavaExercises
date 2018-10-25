package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import util.DriverFactory;

public class StartingStep extends DriverFactory{
	
	@Given("^I am a user on the landing page$")
	public void setup() throws Throwable {
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
	}

	@Before
	public void beforeScenario() {
		driver= new DriverFactory().getDriver();
		//System.out.println("this will run before the actual scenario");
	}
}
