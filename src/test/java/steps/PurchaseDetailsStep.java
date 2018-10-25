package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import domain.AdditionalInfo;
import domain.Passenger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PurchaseDetailPage;
import util.DriverFactory;

import java.util.List;

public class PurchaseDetailsStep extends DriverFactory {
    @And("^provide passengers info$")
    public void providePassengersInfo(List<Passenger> passengers) throws Throwable {
        new PurchaseDetailPage(driver).writePassengerNamesTextBox(passengers, PurchaseDetailPage.firstNameTextBox, PurchaseDetailPage.lastNameTextBox);
        new PurchaseDetailPage(driver).selectMealInDropDownList(passengers, PurchaseDetailPage.mealDropDown);
    }

    @And("^provide credit card info$")
    public void provideCreditCardInfo(List<AdditionalInfo> creditCardinfo) throws Throwable {
        AdditionalInfo currentCreditCardinfo = creditCardinfo.get(0);
        new PurchaseDetailPage(driver).selectDropDownListByVisibleText(currentCreditCardinfo.typeCC, PurchaseDetailPage.creditCardDropDown);
        new PurchaseDetailPage(driver).writeInTextBoxGeneral(currentCreditCardinfo.firstNameHolderCC, PurchaseDetailPage.firstNameCreditCardHolderTextBox);
        new PurchaseDetailPage(driver).writeInTextBoxGeneral(currentCreditCardinfo.middleNameHolderCC, PurchaseDetailPage.midNameCreditCardHolderTextBox);
        new PurchaseDetailPage(driver).writeInTextBoxGeneral(currentCreditCardinfo.lastNameHolderCC, PurchaseDetailPage.lastNameCreditCardHolderTextBox);
        new PurchaseDetailPage(driver).writeInTextBoxGeneral(currentCreditCardinfo.numberCC, PurchaseDetailPage.creditNumberTextBox);
        try {
            new PurchaseDetailPage(driver).selectDropDownListByVisibleText(currentCreditCardinfo.expirationMonthCC, PurchaseDetailPage.expirationMonthCreditCardTextBox);
            new PurchaseDetailPage(driver).selectDropDownListByVisibleText(currentCreditCardinfo.expirationYearCC, PurchaseDetailPage.expirationYearCreditCardTextBox);
        } catch (Throwable exc) {
            System.out.println("There was a problem with any value of expiration credit card date");
            System.out.println(exc.toString());
        }

    }

    @And("^provide billing address$")
    public void provideBillingAddress(List<AdditionalInfo> billInfo) throws Throwable {
        AdditionalInfo currentBillInfo = billInfo.get(0);
        new PurchaseDetailPage(driver).checkBoxSelection(currentBillInfo.checkPropAddres, PurchaseDetailPage.ticketLessCheckBox);
        new PurchaseDetailPage(driver).writeInTextBoxGeneral(currentBillInfo.address, PurchaseDetailPage.billAddress1);
        new PurchaseDetailPage(driver).writeInTextBoxGeneral(currentBillInfo.address, PurchaseDetailPage.billAddress2);
        new PurchaseDetailPage(driver).writeInTextBoxGeneral(currentBillInfo.cityAddress, PurchaseDetailPage.billCity);
        new PurchaseDetailPage(driver).writeInTextBoxGeneral(currentBillInfo.provinceAddress, PurchaseDetailPage.billState);
        new PurchaseDetailPage(driver).writeInTextBoxGeneral(currentBillInfo.zipCodeAddress, PurchaseDetailPage.billZip);
        try {
            new PurchaseDetailPage(driver).selectDropDownListByVisibleText(currentBillInfo.countryAddress, PurchaseDetailPage.billCountry);
        } catch (Throwable exc) {
            System.out.println("There was a problem with the country field more details: ");
            System.out.println(exc.toString());
        }
    }

    @And("^provide delivery address$")
    public void provideDeliveryAddress(List<AdditionalInfo> delInfo) throws Throwable {
        AdditionalInfo currentDelInfo = delInfo.get(0);
        new PurchaseDetailPage(driver).checkBoxSelection(currentDelInfo.checkPropAddres, PurchaseDetailPage.sameAsBillingCheckBox);
        new PurchaseDetailPage(driver).writeInTextBoxGeneral(currentDelInfo.address, PurchaseDetailPage.delAddress1);
        new PurchaseDetailPage(driver).writeInTextBoxGeneral(currentDelInfo.address, PurchaseDetailPage.delAddress2);
        new PurchaseDetailPage(driver).writeInTextBoxGeneral(currentDelInfo.cityAddress, PurchaseDetailPage.delCity);
        new PurchaseDetailPage(driver).writeInTextBoxGeneral(currentDelInfo.provinceAddress, PurchaseDetailPage.delState);
        new PurchaseDetailPage(driver).writeInTextBoxGeneral(currentDelInfo.zipCodeAddress, PurchaseDetailPage.delZip);
        try {
            new PurchaseDetailPage(driver).selectDropDownListByVisibleText(currentDelInfo.countryAddress, PurchaseDetailPage.delCountry);
        } catch (Throwable exc) {
            System.out.println("There was a problem with the country field more details: ");
            System.out.println(exc.toString());
        }
    }


}
