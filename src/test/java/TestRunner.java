import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"/home/kshitijbaluni/IdeaProjects/cucumber-application/src/test/resources/tag.feature"},
        glue = {"steps/"},
        dryRun = false,
        monochrome = true
)
public class TestRunner {
}
