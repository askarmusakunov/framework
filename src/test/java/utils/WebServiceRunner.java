package utils;

import apiBeans.EmployeeCreateRequestBody;
import apiBeans.EmployeeResponse;
import apiBeans.EmployeesResponse;
import apiBeans.HeaderManager;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import okhttp3.RequestBody;

public class WebServiceRunner {

	private static EmployeeResponse employeeResponse;
	private static EmployeeResponse[] employeesResponse;
	private static ObjectMapper mapper = new ObjectMapper();
	
	public static void runEmployeeGetRequest(String resource){
		String url = Config.getProperty("employeeURL") + resource;
		Response response = RestAssured.get(url);
//		System.out.println("Response String: " + response.asString());
		System.out.println("Service status: " + response.statusCode());
		try {
			employeeResponse = mapper.readValue(response.asString(), EmployeeResponse.class);
		} catch (Exception e) {
			System.out.println("conversion failed");
		} 
	}

	public static void runEmployeesGetRequest(){
		String url = Config.getProperty("employeesURL");
		Response response = RestAssured.get(url);
//		System.out.println("Response String: " + response.asString());
		System.out.println("Service status: " + response.statusCode());
		try {
			employeesResponse = mapper.readValue(response.asString(), EmployeeResponse[].class);
		} catch (Exception e) {
			System.out.println("conversion failed");
		}
	}
	
	public static void runPostRequest(EmployeeCreateRequestBody body){
		String url = Config.getProperty("apiURL");
		Response response;
		response = RestAssured.given().contentType(ContentType.JSON).body(body).when()
					.post(url);

		
		//System.out.println("Response String: " + response.asString());
		System.out.println("Service status: " + response.statusCode());
		try {
			employeeResponse = mapper.readValue(response.asString(), EmployeeResponse.class);
		} catch (Exception e) {
			System.out.println("conversion failed");
		} 
	}
	
	public static EmployeeResponse getEmployeeResponse(){
		if(employeeResponse != null)
			return employeeResponse;
		System.out.println("request not ran yet");
		return null;
	}


	public static EmployeeResponse[] getEmployeesResponse(){
		if(employeesResponse != null)
			return employeesResponse;
		System.out.println("request not ran yet");
		return null;
	}
}
