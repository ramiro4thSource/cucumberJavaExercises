package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;
import java.util.HashMap;

public class BookDetailPageScreen {

    @FindBy (name="passCount") public WebElement passengersDropDown;
    @FindBy (name="fromPort") public WebElement departingFromDropDown;
    @FindBy (name="fromMonth") public WebElement fromMonthDropDown;
    @FindBy (name="fromDay") public WebElement fromDayDropDown;
    @FindBy (name="toPort") public WebElement arrivingInDropDown;
    @FindBy (name="toMonth") public WebElement toMonthDropDown;
    @FindBy (name="toDay") public WebElement toDayDropDown;

    public WebElement asdad= new RemoteWebElement();



    public BookDetailPageScreen(){

    }


}
