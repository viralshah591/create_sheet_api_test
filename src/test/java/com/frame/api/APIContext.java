package com.frame.api;

import static com.jayway.restassured.RestAssured.given;
import java.util.HashMap;
import java.util.Map;
import com.api.properties.AppProperties;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.specification.RequestSpecification;

public class APIContext {

    private String authToken;

    /**
     * No argument Constructor
     */
    public APIContext() {
        RestAssured.baseURI = AppProperties.getRESTFulSecureURL();
        setAuthToken("Bearer h2kw0jaze7014hzogpeirafr8p");
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public RequestSpecification getBuildBaseParams() {
        return given().headers(headersList());
    }

    /**
     * Method to hold headers
     *
     * @return
     */
    private Map<String, String> headersList() {

        Map<String, String> listOfHeaders = new HashMap<String, String>();
        listOfHeaders.put("Authorization", getAuthToken());
        listOfHeaders.put("Content-Type", "application/json");
        listOfHeaders.put("accept", "application/json");
        return listOfHeaders;
    }
}