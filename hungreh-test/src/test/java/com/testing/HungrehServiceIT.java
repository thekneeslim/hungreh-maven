package com.testing;

import org.junit.Test;

import static com.jayway.restassured.RestAssured.when;

public class HungrehServiceIT {

    @Test
    public void justToMakeSureItIsWorking() {
        when()
                .get("http://localhost:8090/")
                .then()
                .statusCode(200);
    }
}