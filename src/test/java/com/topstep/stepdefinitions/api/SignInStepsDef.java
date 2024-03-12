package com.topstep.stepdefinitions.api;

import com.topstep.model.signinmanagementservice.request.SignInRequest;
import com.topstep.model.signinmanagementservice.response.SignInSuccessfulResponse;
import com.topstep.model.signinmanagementservice.response.SignInUnauthorizedResponse;
import com.topstep.stepdefinitions.ScenarioContext;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;


import static com.topstep.utils.ConfigurationReader.getProperty;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class SignInStepsDef {
    private SignInRequest signInRequest;
    private SignInSuccessfulResponse signInSuccessfulResponse;
    private SignInUnauthorizedResponse signInUnauthorizedResponse;
    private final ScenarioContext scenarioContext;


    public SignInStepsDef(ScenarioContext scenarioContext) {
        this.scenarioContext = scenarioContext;
    }


    @When("User sends a POST request to the sign-in endpoint with these credentials")
    public void user_sends_a_post_request_to_the_sign_in_endpoint_with_these_credentials() throws Exception {
        System.out.println("Making a request POST call...");
        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper.writeValueAsString(signInRequest);

        Response response = given()
                .baseUri(getProperty("baseURI"))
                .header("Accept", "application/json")
                .header("Content-type", "application/json")
                .header("x-xsrf-token", getProperty("x-xsrf-token"))
                .header("cookie", getProperty("cookie"))
                .body(requestBody)
                .log().all()
                .when()
                .post("/api/users/sign_in")
                .then()
                .extract()
                .response();

        scenarioContext.setResponse(response);
        if (response.statusCode() == 200) {
            signInSuccessfulResponse = response.as(SignInSuccessfulResponse.class);
        } else if (response.statusCode() == 401) {
            signInUnauthorizedResponse = response.as(SignInUnauthorizedResponse.class);
        }
    }

    @Given("User has a set of credentials of {string} and {string} and {string}")
    public void user_has_a_set_of_credentials_of_and_and(String username, String password, String device_uuid) {
        signInRequest = new SignInRequest(username, password, true, device_uuid, true);
    }


    @Then("Response body should have {string}")
    public void response_body_should_have(String responseMessage) {
        System.out.println("Validating the response payload contains expected response message...");

        if (scenarioContext.getResponse().statusCode() == 200) {
            assertEquals(responseMessage, signInSuccessfulResponse.getUser().getStatus());
        } else if (scenarioContext.getResponse().statusCode() == 401) {
            assertEquals(responseMessage, signInUnauthorizedResponse.getError());
        } else if (scenarioContext.getResponse().statusCode() == 403) {
            assertEquals(responseMessage, scenarioContext.getResponse().getBody().jsonPath().get("errors"));
        }

    }
}
