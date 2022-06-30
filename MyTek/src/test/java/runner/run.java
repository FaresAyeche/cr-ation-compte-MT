package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features="src/test/resources/Feature", glue= "CcDemo",tags="ins",plugin = {"pretty","html:target/cucumber-report.html"})


public class run {

}
