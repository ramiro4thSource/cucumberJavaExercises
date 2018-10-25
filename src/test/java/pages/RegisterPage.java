package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Class which represent the register page on the web site
 * */
public class RegisterPage {
	WebDriver driver;

	@FindBy(name="firstName") public WebElement fNameTxt;
	@FindBy (name="lastName") public WebElement lNameTxt;
	@FindBy (name="phone") public WebElement phoneTxt;
	@FindBy (name="userName") public WebElement emailTxt;
	@FindBy (name="address1") public WebElement adress1Txt;
	@FindBy (name="address2") public WebElement adress2Txt;
	@FindBy (name="city") public WebElement cityTxt;
	@FindBy (name="state") public WebElement stateTxt;
	@FindBy (name="postalCode") public WebElement zipCodeTxt;
	@FindBy (name="country") public WebElement countryDropDown;
	@FindBy (name="email") public WebElement userNameTxt;
	@FindBy (name="password") public WebElement passwordTxt;
	@FindBy (name="confirmPassword") public WebElement confirmPasswordTxt;
	@FindBy (name="register") public WebElement registerBttn;
	
	/**
	 * Constructor which initialize class as factory.
	 * @param driver Common WebDriver object 
	 * */
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * Represents the action of writing user first name in "user first name" field in web form
	 * @param fName The first name from user.
	 * */
	public void I_provide_my_first_name(String fName) {
		fNameTxt.sendKeys(fName);
		System.out.println("Hola");
	}
	
	/**
	 * Represents the action of writing user last name in "user last name" field in web form
	 * @param lName The last name from user.
	 * */
	public void I_provide_my_last_name(String lName) {
		lNameTxt.sendKeys(lName);
	}
	
	/**
	 * Represents the action of writing user phone in "user phone" field in web form
	 * @param phone The  phone from user.
	 * */
	public void I_provide_my_phone(String phone) {
		phoneTxt.sendKeys(phone);
	}
	
	/**
	 * Represents the action of writing user address in field in web form
	 * @param address1 Address first part
	 * @param address2 The second part of address
	 * */
	public void I_provide_my_adress(String address1, String address2) {
		adress1Txt.sendKeys(address1);
		adress2Txt.sendKeys(address2);
	}
	
	/**
	 * Represents the action of writing user city in "user city" field in web form
	 * @param city The  city from user.
	 * */
	public void I_provide_my_city(String city) {
		cityTxt.sendKeys(city);
	}
	
	/**
	 * Represents the action of writing user state in "user state" field in web form
	 * @param state The  state from user.
	 * */
	public void I_provide_my_state(String state) {
		stateTxt.sendKeys(state);
	}

	/**
	 * Represents the action of selecting a value for country  field in web form
	 * @param country The  country from user.
	 * */
	public void I_provide_my_country(String country) {
		new Select(countryDropDown).selectByVisibleText(country);
	}

	
	/**
	 * Represents the action of writing user email in "user email" field in web form
	 * @param email The  email from user.
	 * */
	public void I_provide_my_email(String email) {
		emailTxt.sendKeys(email);
	}

	/**
	 * Represents the action of writing userName in  field in web form
	 * @param userName The  email from user.
	 * */
	public void I_provide_my_userName(String userName) {
		userNameTxt.sendKeys(userName);
	}

	/**
	 * Represents the action of writing userName in  field in web form
	 * @param zipCode The  zipCode from user.
	 * */
	public void I_provide_my_zipCode(String zipCode) {
		zipCodeTxt.sendKeys(zipCode);
	}
	
	/**
	 * Represents the action of writing password 
	 * @param password password from user
	 * */
	public void I_provide_my_password(String password) {
		passwordTxt.sendKeys(password);
	}
	
	/**
	 * Represents the action of writing password confirm in the web form field
	 * @param password password from user
	 * */
	public void I_provide_my_confirm_my_password(String password) {
		confirmPasswordTxt.sendKeys(password);
	}
	
	/**
	 * Represents the action of submitting the current form.
	 * */
	public void I_sign_up() {
		registerBttn.submit();
	}
	
}
