package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Class that represents the web site "landing page"
 * */
public class LandingPage {
	
WebDriver driver;
	
	@FindBy (linkText="REGISTER") private WebElement registerLink;
	@FindBy (name="userName") public WebElement fNameTxt;
	@FindBy (name="password") public WebElement passwordTxt;
	@FindBy (name="login") public WebElement logInBttn;
	
	/**
	 * Constructor which initialize class as factory.
	 * @param driver Common WebDriver object 
	 * */
	public LandingPage(WebDriver driver) {			
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}
	
	/**
	 * Represents the action of clicking "Register" link within "landing page"
	 * */
	public void I_decide_to_create_an_account() throws Throwable {
		registerLink.click();
	}

	public void provideUserName(String userName){
		fNameTxt.sendKeys(userName);
	}

	public void providePassword(String password){
		passwordTxt.sendKeys(password);
	}

	public void decideToSignIn(){
		logInBttn.click();
	}
}
