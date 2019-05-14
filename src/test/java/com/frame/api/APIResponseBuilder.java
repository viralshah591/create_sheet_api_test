package com.frame.api;

import java.util.Map;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class APIResponseBuilder {

    /**
     * @param context
     * @param formParams
     * @return
     */
    public static String createSheet(APIContext context, Map<String, Object> formParams, String url) {
        RequestSpecification rs = context.getBuildBaseParams();
        Response resp = rs.body(formParams).when().post(url);
        String jsonResp = resp.getBody().asString();
        return jsonResp;
    }
}