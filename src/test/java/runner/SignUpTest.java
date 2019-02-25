package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/", tags="@Signup",glue= {"steps"},
plugin = {"pretty", "html:target/bookingFlight/cucumber", "json:target/bookingFlight/cucumber.json"})
public class SignUpTest {

}
