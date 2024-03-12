package com.topstep.stepdefinitions.api;

import com.topstep.model.updateusermanagementservice.request.UpdateRequest;
import com.topstep.model.updateusermanagementservice.response.UpdateSuccessfulResponse;
import com.topstep.stepdefinitions.ScenarioContext;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;


import static com.topstep.utils.ConfigurationReader.getProperty;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class UpdateUserStepsDef {
    private final ObjectMapper objectMapper = new ObjectMapper();
    private UpdateSuccessfulResponse updateSuccessfulResponse;
    private UpdateRequest request;
    private Response response;
    private String requestPayload;
    private final ScenarioContext scenarioContext;


    public UpdateUserStepsDef(ScenarioContext scenarioContext) {
        this.scenarioContext = scenarioContext;
    }


    @Given("User has valid request payload")
    public void user_has_valid_request_payload() throws Throwable {
        request = new UpdateRequest();
        requestPayload = objectMapper.writeValueAsString(request.generateUserRequest());
    }

    @When("User sends a PATCH request")
    public void user_sends_a_patch_request() {
        System.out.println("Making a request PATCH call...");
        response = given()
                .baseUri(getProperty("baseURI"))
                .header("Accept", "application/json")
                .header("Content-type", "application/json")
                .header("x-xsrf-token", getProperty("x-xsrf-token"))
                .header("cookie", getProperty("cookie"))
                .body(requestPayload)
                .log().all()
                .when()
                .patch("/api/users/446942")
                .then()
                .extract()
                .response();
        scenarioContext.setResponse(response);
        updateSuccessfulResponse = response.as(UpdateSuccessfulResponse.class);
    }

    @Then("Status code should be {int}")
    public void status_code_should_be(int statusCode) {
        System.out.println("Validating response status code...");
        assertEquals(statusCode, scenarioContext.getResponse().getStatusCode());
    }


    @When("User sends a PATCH request with new changes in the request payload")
    public void user_sends_a_patch_request_with_new_changes_in_the_request_payload() throws Exception {
        System.out.println("Making a request PATCH call...");
        requestPayload = objectMapper.writeValueAsString(request.generateModifiedUserRequest());
        response = given()
                .baseUri(getProperty("baseURI"))
                .header("Accept", "application/json")
                .header("Content-type", "application/json")
                .header("x-xsrf-token", getProperty("x-xsrf-token"))
                .header("cookie", getProperty("cookie"))
                .body(requestPayload)
                .log().all()
                .when()
                .patch("/api/users/446942")
                .then()
                .extract()
                .response();
        scenarioContext.setResponse(response);
        updateSuccessfulResponse = response.as(UpdateSuccessfulResponse.class);
    }

    @When("User sends a PATCH request using invalid user_id in the endpoint")
    public void user_sends_a_patch_request_using_invalid_user_id_in_the_endpoint() {
        System.out.println("Making a request PATCH call...");
        response = given()
                .baseUri(getProperty("baseURI"))
                .header("Accept", "application/json")
                .header("Content-type", "application/json")
                .header("x-xsrf-token", getProperty("x-xsrf-token"))
                .header("cookie", getProperty("cookie"))
                .body(requestPayload)
                .log().all()
                .when()
                .patch("/api/users/446943")
                .then()
                .extract()
                .response();
        scenarioContext.setResponse(response);
    }

    @Then("Response body should have profile_id {int} and status {string}")
    public void response_body_should_have_profile_id_and_status(int profile_id, String status) {
        System.out.println("Validating the response payload contains expected response message...");
        if (response.statusCode() == 200) {
            assertEquals(profile_id, updateSuccessfulResponse.getUser().getProfile_id());
            assertEquals(status, updateSuccessfulResponse.getUser().getStatus());
        } else if (response.statusCode() == 403) {
            assertEquals("Forbidden", scenarioContext.getResponse().getBody().jsonPath().get("errors"));
        }
    }

}
