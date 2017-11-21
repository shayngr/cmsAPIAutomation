package tests;

import com.jayway.restassured.http.ContentType;
import content_type.model.Content;

import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;


public class ContentPostTest {


    @Test
    public void createContentType(){


        Content content = new Content();
        content.setClazz("com.dotcms.contenttype.model.type.ImmutableSimpleContentType");
        content.setDefaultType(false);
        content.setName("The Content Type 1");
        content.setDescription("THE DESCRIPTION");
        content.setHost("48190c8c-42c4-46af-8d1a-0cd5db894797");
        content.setOwner("dotcms.org.1");
        content.setVariable("TheContentType1");
        content.setFixed(false);
        content.setSystem(false);
        content.setFolder("SYSTEM_FOLDER");

        given().contentType(ContentType.JSON)

                .when()
                .body(content)
                .post()

                .then()
                .statusCode(201);

    }


}
