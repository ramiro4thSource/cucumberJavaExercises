package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/", tags="@Signup",glue= {"steps"},
plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})
public class SignUpTest {

}
