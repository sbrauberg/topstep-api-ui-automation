package com.topstep.stepdefinitions;

import io.restassured.response.Response;

public class ScenarioContext {
    private Response response;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}

