package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import model.Weather;
import org.apache.http.HttpStatus;
import org.junit.Assert;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class WeatherDefinitions {

    RequestSpecification requestSpecification = RestAssured.given();

    @Given("^Test if the api is giving status OK$")
    public void test_if_the_api_is_giving_status_OK() throws Exception {

        int statusCode = given().get(SetupDefinitions.uri)
                .statusCode();

        Assert.assertEquals(statusCode, HttpStatus.SC_OK);
        System.out.println("Application Test Status code::" + statusCode);
    }

    @When("^The api giving JSON response body$")
    public void the_api_giving_JSON_response_body() throws Exception {

        //System.out.println("Weather response data ::" + get(SetupDefinitions.uri).body().jsonPath());

        //Weather weather = get(SetupDefinitions.uri).getBody().as(Weather.class);
        //System.out.println("Weather Data ::" + weather);



        Weather weather1 = get(SetupDefinitions.uri).getBody().as(Weather.class);

        System.out.println("Weather Data ::" + weather1.toString());
        /*Post post = get("http://localhost:3000/posts/1").getBody().as(Post.class);
        System.out.println("Post data ::" + post.toString());*/

    }

    @When("^API have weather related data$")
    public void api_have_weather_related_data() throws Exception {

    }

    @Then("^API is working Properly$")
    public void api_is_working_Properly() throws Exception {

    }

}
