package APITest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class loginLogOut_apiTest {

	String base_uri = "https://the-internet.herokuapp.com";

	@Test
	public void submitForm() {
		RestAssured.baseURI = base_uri;
		given().urlEncodingEnabled(true)
		.param("username", "tomsmith")
		.param("password", "SuperSecretPassword!")
		.header("Accept", ContentType.JSON.getAcceptHeader())
		.post("/authenticate")
		.then()
		.statusCode(200);
	}

}