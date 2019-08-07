package apiBeans;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


import static io.restassured.RestAssured.given;

public class RestAssuredClassEx {


   private static RequestSpecification request;
   private static Response response;
   private   static String url = "http://dummy.restapiexample.com/apiBeans/v1/employee/15787";


    public static void main(String args[]) {

        request = RestAssured.given().accept(ContentType.JSON);

        response = request.when().get(url);
        System.out.println(response.asString());
    }




}
