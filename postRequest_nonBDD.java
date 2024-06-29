import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

public class postRequest_nonBDD {

    public static void main(String[] args) {

        RestAssured.baseURI = "https://reqres.in/api/users";
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/json");
        request.body("{\"name\": \"Mostafa\",\"job\": \"Tester\"}");
        Response response = request.post();
        response.prettyPrint();

        // response.then().statusCode(201);

        int statuscode = response.statusCode();
        Assert.assertEquals(statuscode, 201);


    }
}
