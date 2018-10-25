package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import domain.UserInfo;
import pages.LandingPage;
import util.DriverFactory;

import java.util.List;


public class SignInStep extends DriverFactory {

    @When("^I provide my credentials as follows$")
    public void iProvideMyCredentialsAsFollows(List <UserInfo> users) {
        UserInfo currentUser = users.get(0);
        try {
            new LandingPage(driver).provideUserName(currentUser.userName);
            new LandingPage(driver).providePassword(currentUser.password);
        }
        catch(Throwable exc){System.out.println(exc.toString());}
    }

    @And("^decide to sign in$")
    public void decideToSignIn()  {
        try {
            new LandingPage(driver).decideToSignIn();
        }
        catch (Throwable exc){System.out.println(exc.toString());}
    }
}
