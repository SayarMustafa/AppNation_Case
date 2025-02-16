package steps.apisteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import request.CreateUserRequest;
import response.CreateUserResponse;

import static io.restassured.RestAssured.given;

public class JsonPlaceHolderSteps extends ApiBaseSteps {
    CreateUserResponse userResponse = new CreateUserResponse();
    @When("a user make a get request to {string}")
    public void aUserMakeAGetRequestTo(String endpoint) {
        response = given()
                .header("Content-Type", "application/json; charset=UTF-8")
                .when()
                .get(endpoint)
                .then()
                .extract().response();
    }

    @Then("the response should contain email, name and body fields")
    public void theResponseShouldContainEmailNameAndBodyFields() {
        Assertions.assertThat(response.getBody().jsonPath().getString("title")).isNotEmpty();
        Assertions.assertThat(response.getBody().jsonPath().getString("body")).isNotEmpty();

    }


    @Then("the response status should be {int}")
    public void theResponseStatusShouldBe(int statusCode) {
        Assertions.assertThat(response.getStatusCode()).isEqualTo(statusCode);
    }

    @When("a user make a post request to {string} with params {string} as title, {string} as body, {int} as userId")
    public void aUserMakeAPostRequestToWithParamsAsTitleAsBodyAsUserId(String endpoint, String title, String body, int userId) {
        CreateUserRequest requestBody = CreateUserRequest.builder().title(title).body(body).userId(userId).build();
        response = given()
                .header("Content-Type", "application/json; charset=UTF-8")
                .body(requestBody)
                .when()
                .post(endpoint)
                .then()
                .extract().response();
        userResponse = response.as(CreateUserResponse.class);
    }

    @Then("the response should contain title as {string}, body as {string}, userId as {int}")
    public void theResponseShouldContainTitleAsBodyAsUserIdAs(String title, String body, int userId) {
        Assertions.assertThat(userResponse.getTitle()).isEqualTo(title);
        Assertions.assertThat(userResponse.getBody()).isEqualTo(body);
        Assertions.assertThat(userResponse.getUserId()).isEqualTo(userId);
    }

    @Then("the response should contain id field")
    public void theResponseShouldContainIdField() {
        Assertions.assertThat(userResponse.getId()).isNotNull();
    }
}
