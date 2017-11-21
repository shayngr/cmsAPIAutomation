package tests;

import com.jayway.restassured.http.ContentType;
import content_type.model.Content;
import org.junit.Test;
import static com.jayway.restassured.RestAssured.given;

public class ContentPutTest {


    @Test
    public void updateContentType(){

        Content content = new Content();
        content.setName("The Content Type 2");
        content.setDescription("THE DESCRIPTION");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(content)
                .put("/id/4c441ada-944a-43af-a653-9bb4f3f0cb2b")

                .then()
                .statusCode(200);
    }




}
