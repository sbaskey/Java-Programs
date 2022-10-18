package org.example;


import static io.restassured.RestAssured.*;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class RESTAPI{

    @Test
    public static void main(String[] args) {
        System.out.println("Rest-assured API");

//        Response response= get("https://reqres.in/api/users/688");
//        System.out.println(response.getBody().asString());
//        System.out.println(response.getContentType());
//        System.out.println(response.getStatusCode());
//
//        Assert.assertEquals(response.statusCode(),200);

    }

    @Test
    void Get()
    {
        System.out.println("Get call");
        given().get("https://reqres.in/api/users?page=2").
                then().
                statusCode(200).log().all();
    }


    @Test
    void Post()
    {
        System.out.println("Post call");
        JSONObject request=new JSONObject();
        request.put("name","surendra");
        request.put("job","developer");
        given().body(request.toString()).when().post("https://reqres.in/api/users").then().statusCode(201).log().all();

    }

@Test
    void Put()
    {
        System.out.println("Put call");
        JSONObject request=new JSONObject();
        request.put("name","surendra");
        request.put("job","developer");
        given().body(request.toString()).when().put("https://reqres.in/api/users/2").then().statusCode(200).log().all();

    }

    @Test
    void Delete()
    {

        System.out.println("Delete Call");
        given().delete("https://reqres.in/api/users/2").
                then().statusCode(204).log().all();

    }
}