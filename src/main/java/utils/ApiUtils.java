package utils;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiUtils {

	public static String getTokenFromHeader(Response response) {
		return response.getHeader("Authorization");
	}

//	public static Response postRequest(){
//		Response response = given()
//				.header("Content-Type", "application/json; charset=UTF-8")
//				.body("{\n" +
//						"  \"title\": \"foo\",\n" +
//						"  \"body\": \"bar\",\n" +
//						"  \"userId\": 1\n" +
//						"}") // JSON body
//				.when()
//				.post("/posts") // POST to /posts
//				.then()
//				.statusCode(201) // Assert that the status code is 201 (Created)
//				.extract().response();
//
//	}

}
