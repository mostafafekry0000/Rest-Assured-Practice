import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class QueryParameter {

    public static void main(String[] args) {

        RestAssured.baseURI ="https://reqres.in/api/users";
        RequestSpecification request = RestAssured.given();
        request.queryParam("page","2");
        Response response = request.get();
        response.prettyPrint();
    }
}
