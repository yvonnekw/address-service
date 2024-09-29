package com.auction.address_service;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class AddressServiceApplicationTests {

	@Test
	void shouldCreateAddress() {
		String requestBody = """ 	
                               {
                               "userId" : 1,
                                "street" : "my street",\s
                                "city" : "the city",\s
                                "state" : " my state",\s
                                "postalCode" : "NEW 8UY",\s
                                "country" : "UK",\s
                                "isBillingAddress" : "true",\s
                                "isShippingAddress" : "true"
                               }
                               """;
		RestAssured.given()
				.contentType("application/json")
				.body(requestBody)
				.when()
				.post("/api/address/create-address")
				.then()
				.statusCode(200)
				.body("addressId", Matchers.notNullValue());
		//.body("firstName", Matchers.equalTo("Kim"))
		//.body("lastName", Matchers.equalTo("Kwebena"))
		//.body("telephone", Matchers.equalTo("09988765543"));
	}

}
