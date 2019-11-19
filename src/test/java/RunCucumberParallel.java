import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;


public class RunCucumberParallel extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}