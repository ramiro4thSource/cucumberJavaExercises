package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import pages.FlightSelectionPage;
import util.DriverFactory;

public class FlightSelectionStep extends DriverFactory {

    @And("^select a flight randomly$")
    public void selectAFlightRandomly() {
        try {
            new FlightSelectionPage(driver).selectRadioBtnnRandomly(FlightSelectionPage.departSelectRdbBttn);
            new FlightSelectionPage(driver).selectRadioBtnnRandomly(FlightSelectionPage.returnSelectRdbBttn);
        } catch (Throwable exc) {
            System.out.println(exc);
        }
    }

    @And("^press continue$")
    public void pressContinue() throws Throwable {
        new FlightSelectionPage(driver).pressContinueBttn();
    }
}
