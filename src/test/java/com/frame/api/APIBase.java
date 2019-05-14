package com.frame.api;

import com.api.properties.AppProperties;

public class APIBase {
    public void init() {
        String url = AppProperties.getRESTFulSecureURL();
    }
}