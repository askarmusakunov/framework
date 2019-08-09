package javaExamples;

import apiBeans.PositiveGoRestResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.IOException;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class RestExamples {


    public static void main(String args[]) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

//        Response response = RestAssured
//                .given()
//                .accept(ContentType.JSON)
//                .when()
//                .get("http://dummy.restapiexample.com/api/v1/employee/16036");
//
//        System.out.println(response.asString());
//
//
//        try {
//            Employee employee = mapper.readValue(response.asString(), Employee.class);
//
//            assertEquals("15909", employee.getId());
//            assertEquals("MyAwesomeName70632", employee.getEmployee_name());
//            assertEquals("71", employee.getEmployee_salary());
//            assertEquals("186", employee.getEmployee_age());
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        Response response1 = RestAssured
//                .given()
//                .accept(ContentType.JSON)
//                .when()
//                .get("http://dummy.restapiexample.com/api/v1/employee/16036");
//
//        System.out.println(response1.asString());
//
//        Employee employee2 = mapper.readValue(response1.asString(), Employee.class);
//
//        assertEquals("15920", employee2.getId());
//        assertEquals("2344", employee2.getEmployee_name());
//        assertEquals("37", employee2.getEmployee_salary());
//        assertEquals("193", employee2.getEmployee_age());
//        assertEquals("", employee2.getProfile_image());
//
//
//        String createURL = "http://dummy.restapiexample.com/api/v1/create";
//        String bodyStr = "{\"name\":\"David Trezegett\",\"salary\":\"123\",\"age\":\"23\"}";
//
//        Response createMethodResponse = RestAssured
//                .given()
//                .accept(ContentType.JSON)
//                .contentType(ContentType.JSON)
//                .body(bodyStr)
//                .when()
//                .post(createURL);
//
//
//        System.out.println(createMethodResponse.asString());

//       EmployeePostResponse employeePostResponse =
//               mapper.readValue(createMethodResponse.asString(), EmployeePostResponse.class);
//        assertEquals("David Trezegett", employeePostResponse.getName());
//        assertEquals(123, employeePostResponse.getSalary());
//        assertEquals(23, employeePostResponse.getAge());

//        EmployeePostErrorResponse employeePostErrorResponse = mapper
//                .readValue(createMethodResponse.asString(),EmployeePostErrorResponse.class);
//
//
//        System.out.println(employeePostErrorResponse.getError().getText());


//        String body = "{\"name\":\"Ali\",\"salary\":\"1223\",\"age\":\"23\"}";
//
//       Response response1 = RestAssured.given().contentType(ContentType.JSON).body(body).when()
//                .post("http://dummy.restapiexample.com/api/v1/create");
//
//
//        System.out.println(response1.asString());


        String goRestCreateURL = "https://gorest.co.in/public-api/users?access-token=7epW7OTFeqikWrdXm1dGolUxAXvaKyXsOMCO";

        GoRestBody goRestBody = new GoRestBody();

        goRestBody.setFirst_name("Ali");
        goRestBody.setLast_name("Sultan");
        Random random = new Random();
        random.nextInt();
        goRestBody.setEmail("Ali.Sultasdddsdn@kcc.com");
        goRestBody.setStatus("active");
        goRestBody.setGender("male");

        Response goRestResponse = RestAssured
                .given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(goRestBody)
                .when()
                .post(goRestCreateURL);


        System.out.println(goRestResponse.asString());


       PositiveGoRestResponse positiveGoRestResponse =
               mapper.readValue(goRestResponse.asString(),PositiveGoRestResponse.class);

      // System.out.println(positiveGoRestResponse.getResult().getFirst_name());
       System.out.println(positiveGoRestResponse.getMeta().getRateLimit().getLimit());
       System.out.println(positiveGoRestResponse.getResult());
       System.out.println(positiveGoRestResponse.getResults().get(0));

    }
}
