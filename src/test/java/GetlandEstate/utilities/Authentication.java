package GetlandEstate.utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Authentication {

    public static String generateToken(){

        String url ="https://medunna.com/api/authenticate";

        String credentials="{\n" +
                "  \"password\": \"Techpro123.\",\n" +
                "  \"rememberMe\": true,\n" +
                "  \"username\": \"techproed\"\n" +
                "}";


        Response response = given().body(credentials).contentType(ContentType.JSON).when().post(url);

        return response.jsonPath().getString("id_token");

    }
}
