package steps.apisteps;

import config.ConfigurationManager;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.baseURI;

public abstract class ApiBaseSteps {

	protected static Response response;

	protected static RequestSpecification request;

	public ApiBaseSteps() {
		baseURI = ConfigurationManager.getProperty("base.uri");

	}

}
