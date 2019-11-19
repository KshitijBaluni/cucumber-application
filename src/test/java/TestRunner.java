import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"/home/kshitijbaluni/IdeaProjects/cucumber-application/src/test/resources/weather.feature"},
        glue = {"steps/"},
        dryRun = false,
        monochrome = true
)
public class TestRunner {

}
