package tests;

import com.jayway.restassured.response.Response;
import content_type.base.BaseTest;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

public class ContentGetTest extends BaseTest {


    @Test
    public void getSpecificContentType(){

        Response response = given()
                .when()
                .get("/id/4c441ada-944a-43af-a653-9bb4f3f0cb2b");

        System.out.println(response.body().prettyPrint());

        given()

                .when()
                .get("/id/4c441ada-944a-43af-a653-9bb4f3f0cb2b")
                .then()
                .statusCode(200);

    }



}
