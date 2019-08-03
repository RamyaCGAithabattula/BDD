package PopupEx;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/popup"},glue= {"PopupEx"},plugin= {"pretty"})
public class TestRunner {

}
