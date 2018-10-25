package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightBookedPage {
    WebDriver driver;

    @FindBy(xpath = "//font[contains(text(),'itinerary has been booked!')]")
    public static WebElement succesMessage;

    public FlightBookedPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    /**
     * Represent a text being displayed
     * @param text text element
     * @return true if element is being displayed
     * */
    public boolean textElementDisplayed(WebElement text){
        return text.isDisplayed();
    }
}
