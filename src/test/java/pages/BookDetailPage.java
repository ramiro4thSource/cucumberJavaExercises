package pages;

import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.DriverFactory;

import java.util.List;

public class BookDetailPage extends DriverFactory {
    WebDriver driver;


    @FindBy (name="tripType") public List<WebElement> tripTypeRdBttn;
    @FindBy (name="passCount") public static WebElement passengersDropDown;
    @FindBy (name="fromPort") public static WebElement departingFromDropDown;
    @FindBy (name="fromMonth") public static WebElement fromMonthDropDown;
    @FindBy (name="fromDay") public static WebElement fromDayDropDown;
    @FindBy (name="toPort") public static WebElement arrivingInDropDown;
    @FindBy (name="toMonth") public static WebElement returningOnMonthDropDown;
    @FindBy (name="toDay") public static WebElement returningOnDayDropDown;
    @FindBy (name="airline") public static WebElement airlineDropDown;
    @FindBy (xpath = "//input[@name='servClass']") public List<WebElement> serviceClassRdBttn;
    @FindBy (name="login") public WebElement logInBttn;


    public BookDetailPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    /**
     * Represents flight type radio buttons. Method will try to match with element form value
     * @param type Dummy value to be evaluated in the control in web form
     * */
    public void selectFlightType(String type) throws Throwable {

        for(int i=0;i<tripTypeRdBttn.size();i++){
            if(tripTypeRdBttn.get(i).getAttribute("value").equalsIgnoreCase(type)){
                tripTypeRdBttn.get(i).click();
                break;
            }
        }

    }

    /**
     * Method that represents a selection in a drop down list. The selection will be done by value
     * @param dummyValue dummy value inserted as entry
     * @param  element web element to test. Just select one of the class members
     * */
    public void selectDropDownListByValue(String dummyValue, WebElement element) throws Throwable{
        new Select(element).selectByValue(dummyValue);
    }

    /**
     * Method that represents a selection in a drop down list. The selection will be done by VisibleText
     * @param dummyValue dummy value inserted as entry
     * @param  element web element to test. Just select one of the class members
     * */
    public void selectDropDownListByVisibleText(String dummyValue, WebElement element) throws Throwable{
        new Select(element).selectByVisibleText(dummyValue);
    }


    /**
     * Represents  the selection of service class by radio buttons. This method will try to match passed parameter with
     * values from radio buttons.
     * @param serviceClass Service Class desired by user.
     * */
    public void selectServiceClass(String serviceClass) throws  Throwable{
        for(int i=0;i<serviceClassRdBttn.size();i++){
            if(serviceClassRdBttn.get(i).getAttribute("value").equalsIgnoreCase(serviceClass)){
                serviceClassRdBttn.get(i).click();
            }
        }
    }

    /**
     * This method applies an explicit wait taking a time out and locator as parameters
     * @param timeOut time out in seconds
     * @param locator Locator to be applied to find web element
     * @return If web control is located return WebElement object, otherwise null object is returned.
     * */
    private WebElement  waitUntilElementVisible(int timeOut, By locator){
        WebDriverWait wait = new WebDriverWait(this.driver,timeOut);
        return  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }





}
