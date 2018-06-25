package com.testing;

import org.junit.Test;

import static com.jayway.restassured.RestAssured.when;

public class HungrehServiceIT extends HungrehTestSetUp {

    @Test
    public void ableToWireMockPortDuringServiceStartUp() {
        when()
                .get("http://localhost:8090/")
                .then()
                .statusCode(200);
    }

}