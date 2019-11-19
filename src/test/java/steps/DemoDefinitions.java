package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoDefinitions {

    @Given("^the Setup is done$")
    public void the_Setup_is_done() throws Exception {
        System.out.println("Setup Done");
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Demo Feature");
    }

    @When("^validation is passed$")
    public void validation_is_passed() throws Exception {
        System.out.println("Validation Passed");
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Demo Feature");
    }

    @Then("^API return the (\\d+) OK status code$")
    public void api_return_the_OK_status_code(int arg1) throws Exception {
        System.out.println("Ok Status");
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Demo Feature");
    }

}
