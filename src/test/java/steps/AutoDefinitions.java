package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.http.HttpStatus;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;

public class AutoDefinitions {

    @Given("^All the things are setup$")
    public void all_the_things_are_setup() throws Exception {
        System.out.println("All the things are setup");

        when().get("http://localhost:3000/posts/1")
                .then().body("id", is(1));
    }

    @When("^You validate the test$")
    public void you_validate_the_test() throws Exception {
        System.out.println("You validate the test");

        when().get("http://localhost:3000/posts")
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

    @Then("^Boot off the system$")
    public void boot_off_the_system() throws Exception {
        System.out.println("Boot off the system");

        given().when().get("http://localhost:3000/comments")
                .then().body("postId", hasItem(1))
                .statusCode(HttpStatus.SC_OK);
    }

}
