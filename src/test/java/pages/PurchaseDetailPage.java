package pages;

import domain.Passenger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Class which represents purchase detail page, please note that methods from this class represent different types of
 * web controls. Is intended to minimize code for control, however specif controls cannot be reused...sorry
 */
public class PurchaseDetailPage {
    WebDriver driver;

    //Passengers Web elements
    @FindBy(xpath = "//input[contains(@name,'passFirst')]")
    public static List<WebElement> firstNameTextBox;
    @FindBy(xpath = "//input[contains(@name,'passLast')]")
    public static List<WebElement> lastNameTextBox;
    @FindBy(xpath = "//select[contains(@name,'pass')]")
    public static List<WebElement> mealDropDown;

    //Credit Card Details web elements
    @FindBy(xpath = "//select[@name='creditCard']")
    public static WebElement creditCardDropDown;
    @FindBy(name = "creditnumber")
    public static WebElement creditNumberTextBox;
    @FindBy(name = "cc_exp_dt_mn")
    public static WebElement expirationMonthCreditCardTextBox;
    @FindBy(name = "cc_exp_dt_yr")
    public static WebElement expirationYearCreditCardTextBox;
    @FindBy(name = "cc_frst_name")
    public static WebElement firstNameCreditCardHolderTextBox;
    @FindBy(name = "cc_mid_name")
    public static WebElement midNameCreditCardHolderTextBox;
    @FindBy(name = "cc_last_name")
    public static WebElement lastNameCreditCardHolderTextBox;

    //Billing Address web elements
    @FindBy(name = "ticketLess")
    public static WebElement ticketLessCheckBox;
    @FindBy(name = "billAddress1")
    public static WebElement billAddress1;
    @FindBy(name = "billAddress2")
    public static WebElement billAddress2;
    @FindBy(name = "billCity")
    public static WebElement billCity;
    @FindBy(name = "billState")
    public static WebElement billState;
    @FindBy(name = "billZip")
    public static WebElement billZip;
    @FindBy(name = "billCountry")
    public static WebElement billCountry;

    //Deliverey Address web elements
    @FindBy(xpath = "//tbody//tr[16]//td[2]//input[1]")
    public static WebElement sameAsBillingCheckBox;
    @FindBy(name = "delAddress1")
    public static WebElement delAddress1;
    @FindBy(name = "delAddress2")
    public static WebElement delAddress2;
    @FindBy(name = "delCity")
    public static WebElement delCity;
    @FindBy(name = "delState")
    public static WebElement delState;
    @FindBy(name = "delZip")
    public static WebElement delZip;
    @FindBy(name = "delCountry")
    public static WebElement delCountry;


    public PurchaseDetailPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Method which represents writing in passengers text boxes. Not general and reusable method
     *
     * @param passengers  list of passengers to be registered. The size of this list should be equals to text box list size
     *                    founded in web form. Otherwise an exception will be shown
     * @param fNameTxtBox first name list text boxes
     * @param lNameTxtBox last name list text boxes
     */
    public void writePassengerNamesTextBox(List<Passenger> passengers, List<WebElement> fNameTxtBox, List<WebElement> lNameTxtBox) throws Throwable {
        if (passengers.size() != fNameTxtBox.size()) {
            throw new Throwable("OOh man, lists should have same size as number of passengers");
        }

        if (fNameTxtBox != null || lNameTxtBox != null) {
            for (int i = 0; i < fNameTxtBox.size(); i++) {
                fNameTxtBox.get(i).sendKeys(passengers.get(i).firstName);
                lNameTxtBox.get(i).sendKeys(passengers.get(i).lastName);
            }
        } else {
            throw new Throwable("Control not founded");
        }
    }

    /**
     * Method which represents writing in passengers text boxes. Not general and reusable method
     *
     * @param passengers   list of passengers to be registered. The size of this list should be equals to drop down list size
     *                     founded in web form. Otherwise an exception will be shown
     * @param mealDropDown meal drop down list
     */
    public void selectMealInDropDownList(List<Passenger> passengers, List<WebElement> mealDropDown) throws Throwable {
        if (passengers.size() != mealDropDown.size()) {
            throw new Throwable("OOh man, lists should have same length");
        }

        if (mealDropDown != null) {
            for (int i = 0; i < mealDropDown.size(); i++) {
                new Select(mealDropDown.get(i)).selectByVisibleText(passengers.get(i).meal);
            }
        } else {
            throw new Throwable("Control not founded");
        }
    }

    /**
     * Method which represents writing in text box. As general method should be provided a text box web element
     * You can use it in credit card, billing address and delivery address sections.
     *
     * @param dummyValue   dummy value inserted as entry
     * @param txtBoxToFill text box element to be testes
     */
    public void writeInTextBoxGeneral(String dummyValue, WebElement txtBoxToFill) {
        if (txtBoxToFill != null) {
            txtBoxToFill.clear();
            txtBoxToFill.sendKeys(dummyValue);
        }
    }

    /**
     * Method that represents a selection in a drop down list. The selection will be done by visible text
     *
     * @param dummyValue dummy value inserted as entry
     * @param dropDown   web element to test. Just select one of the class members
     */
    public void selectDropDownListByVisibleText(String dummyValue, WebElement dropDown) throws Throwable {
        new Select(dropDown).selectByVisibleText(dummyValue);
    }

    /**
     * Method that represents a selection in a drop down list. The selection will be done by value
     *
     * @param dummyValue dummy value inserted as entry
     * @param dropDown   web element to test. Just select one of the class members
     */
    public void selectDropDownListByValue(String dummyValue, WebElement dropDown) throws Throwable {
        new Select(dropDown).selectByValue(dummyValue);
    }

    /**
     * Method that represents a selection in a checkBox.
     *
     * @param dummyValue dummy value inserted as entry
     * @param checkBox   web element to test. Just select one of the class members
     */
    public void checkBoxSelection(String dummyValue, WebElement checkBox) throws Throwable {
        if (dummyValue.equalsIgnoreCase("yes")) checkBox.click();
    }



}
