package steps;

import java.util.List;

import cucumber.api.java.en.*;
import domain.UserInfo;
import pages.RegisterPage;
import util.DriverFactory;

public class RegisterPageStep extends DriverFactory{
	
	
	
	
	@And("^I provide my info correctly as follows$")
	public void I_provide_my_info_correctly_as_follows(List<UserInfo> user) {
		UserInfo currentUser = user.get(0);
		new RegisterPage(driver).I_provide_my_first_name(currentUser.firstName);
		new RegisterPage(driver).I_provide_my_last_name(currentUser.lastName);
		new RegisterPage(driver).I_provide_my_phone(currentUser.phone);
		new RegisterPage(driver).I_provide_my_adress(currentUser.adress, currentUser.adress);
		new RegisterPage(driver).I_provide_my_city(currentUser.city);	
		new RegisterPage(driver).I_provide_my_state(currentUser.province);	
		new RegisterPage(driver).I_provide_my_zipCode(currentUser.zipCode);
		new RegisterPage(driver).I_provide_my_email(currentUser.email);
		new RegisterPage(driver).I_provide_my_userName(currentUser.userName);
		new RegisterPage(driver).I_provide_my_country(currentUser.country);
		new RegisterPage(driver).I_provide_my_password(currentUser.password);
		new RegisterPage(driver).I_provide_my_confirm_my_password(currentUser.password);
		//Call page method
	}
	
	@And("^I submit the form$")
	public void I_submit_the_form() {
		new RegisterPage(driver).I_sign_up();
	}
}
