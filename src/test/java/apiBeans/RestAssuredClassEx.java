package apiBeans;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.WebServiceRunner;


public class RestAssuredClassEx {


   private static RequestSpecification request;
   private static Response response;
   private   static String url = "http://dummy.restapiexample.com/apiBeans/v1/employee/15787";


    public static void main(String args[]) {

        WebServiceRunner.runEmployeeGetRequest("15806");

        EmployeeResponse employeeResponse = WebServiceRunner.getEmployeeResponse();

        System.out.println(employeeResponse.getEmployee_name());




        WebServiceRunner.runEmployeesGetRequest();

        EmployeeResponse[] employeesResponse = WebServiceRunner.getEmployeesResponse();

        System.out.println(employeesResponse[0].getEmployee_name());

    }




}
