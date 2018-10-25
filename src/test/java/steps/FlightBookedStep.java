package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.FlightBookedPage;
import util.DriverFactory;

public class FlightBookedStep extends DriverFactory {
    @Then("^I should get a result$")
    public void iShouldGetAResult() throws Throwable {
        Assert.assertTrue(new FlightBookedPage(driver).textElementDisplayed(FlightBookedPage.succesMessage));
    }
}
