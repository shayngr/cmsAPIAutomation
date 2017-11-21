package tests;

import org.junit.Test;
import static com.jayway.restassured.RestAssured.given;

public class ContentDeleteTest {

    @Test
    public void deleteContentType(){

        given()
                .when()
                .delete("/id/4c441ada-944a-43af-a653-9bb4f3f0cb2b")

                .then()
                .statusCode(204);

    }

}
