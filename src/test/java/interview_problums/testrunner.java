package interview_problums;

import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    format = {"pretty", "html:target/Destination"},
    features={"src/test/resources/UndoFeature.feature"},
    		tags={"@login","@Products"},
    		plugin = {"pretty","html:target/html/automation"}
    )
public class testrunner {
	

}
