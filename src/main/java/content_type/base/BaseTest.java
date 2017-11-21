package content_type.base;


import com.jayway.restassured.RestAssured;
import org.junit.BeforeClass;

public class BaseTest {

    @BeforeClass

    public static void init(){
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
        RestAssured.basePath = "/api/v1/contenttype";
    }

}
