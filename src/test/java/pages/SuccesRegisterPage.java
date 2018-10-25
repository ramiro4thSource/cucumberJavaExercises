package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccesRegisterPage {

	WebDriver driver;
	
	@FindBy(linkText = "REGISTER") private WebElement registerLink;

	/**
	 * Constructor which initialize class as factory.
	 * 
	 * @param driver Common WebDriver object
	 */
	public SuccesRegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	public String isSuccesPage() throws Throwable {
		return driver.getCurrentUrl();
	}
}
