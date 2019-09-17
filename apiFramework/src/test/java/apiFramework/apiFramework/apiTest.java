package apiFramework.apiFramework;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class apiTest {


   @Test
   public void testStatusCode () {
	  
     
     Response res = 
     given().baseUri("http://packman.stage.myntra.com")
     .basePath("packman-service/packman/sellerpacket/13")
     .headers(header())
     .when()
     .get ();
     
     System.out.println("---------------------------");
     System.out.println(res.getBody().asString());

     Assert.assertEquals (res.statusCode (), 200);
   }

 
 public HashMap<String, String> header (){
	 
	 HashMap<String, String> hm =  new HashMap<String, String>();
	 hm.put("authorization", "Basic YToxMg==");
	 return hm;
	 	 
 }
}