package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SetupDefinitions {

    public static final String uri = "http://restapi.demoqa.com/utilities/weather/city/Dehradun";

    @Before
    public void setup() {
        System.out.println("Setup the URI for the test System url ::"+ uri);
    }

    @After
    public void tearDown() {
        System.out.println("Close the System");
    }
}
