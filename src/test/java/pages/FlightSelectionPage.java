package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class FlightSelectionPage {
    WebDriver driver;

    //Web elements
    @FindBy(xpath = "//input[@name='outFlight']")
    public static List<WebElement> departSelectRdbBttn;
    @FindBy(xpath = "//input[@name='inFlight']")
    public static List<WebElement> returnSelectRdbBttn;
    WebElement continueBtnn;

    public FlightSelectionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    /**
     * Represents a random depart selection.
     * @param element Web element to passed as radio button control
     */
    public void selectRadioBtnnRandomly(List<WebElement> element) throws Throwable {
        Random randomValue = new Random();
        if (element!=null) {
            element.get(randomValue.nextInt(departSelectRdbBttn.size()));
        }
        else{
            throw  new Throwable("Radio button control not founded");
        }

    }

    /**
     * Respresents a click in continue button
     * */
    public void pressContinueBttn() throws Throwable{
        continueBtnn= waitUntilElementVisible(10, By.xpath("//input[contains(@name,'Flights')]"));
        if (continueBtnn!=null) {
            continueBtnn.click();
        }
        else{
            throw  new Throwable("Continue button control not founded");
        }
    }


    private WebElement  waitUntilElementVisible(int timeOut, By locator){
        WebDriverWait wait = new WebDriverWait(this.driver,timeOut);
        return  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


}
