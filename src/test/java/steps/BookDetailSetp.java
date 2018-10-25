package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import domain.FlightInfo;
import gherkin.lexer.Th;
import pages.BookDetailPage;
import util.DriverFactory;

import java.util.List;

public class BookDetailSetp extends DriverFactory {
    @And("^provide flight details$")
    public void provideFlightDetails(List<FlightInfo> flights) throws Throwable {
        FlightInfo flight = flights.get(0);
            new BookDetailPage(driver).selectFlightType(flight.type);
            new BookDetailPage(driver).selectDropDownListByValue(flight.passengers, BookDetailPage.passengersDropDown);
            new BookDetailPage(driver).selectDropDownListByValue(flight.departingFrom, BookDetailPage.departingFromDropDown);
            new BookDetailPage(driver).selectDropDownListByVisibleText(flight.onMonth, BookDetailPage.fromMonthDropDown);
            new BookDetailPage(driver).selectDropDownListByValue(flight.onDay, BookDetailPage.fromDayDropDown);
            new BookDetailPage(driver).selectDropDownListByValue(flight.arrivingIn, BookDetailPage.arrivingInDropDown);
            new BookDetailPage(driver).selectDropDownListByVisibleText(flight.returningOnMonth, BookDetailPage.returningOnMonthDropDown);
            new BookDetailPage(driver).selectDropDownListByValue(flight.returningOnDay, BookDetailPage.returningOnDayDropDown);
    }

    @And("^provide preferences$")
    public void providePreferences(List<FlightInfo> flights) {
        FlightInfo flight = flights.get(0);
        try {
            new BookDetailPage(driver).selectServiceClass(flight.serviceClass);
        } catch (Throwable exc) {
            System.out.println(exc.toString());
        }
        try {
            new BookDetailPage(driver).selectDropDownListByVisibleText(flight.airline, BookDetailPage.airlineDropDown);
        } catch (Throwable exc) {
            System.out.println(exc.toString());
        }
    }
}
