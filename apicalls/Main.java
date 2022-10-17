package org.example;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

public class Main {

    public static void main(String[] args) {

         RestAssured.baseURI="https://reqres.in/api/users/2";
         RequestSpecification httpRequest=RestAssured.given();
         Response response = httpRequest.request(Method.GET, "");
         System.out.println("Response=>" + response.getBody().asString());


         JSONObject requestParams= new JSONObject();
         requestParams.put("id", 2000);
         requestParams.put("fname","first name");
        httpRequest.header("Content-Type", "application/json"); // Add the Json to the body of the request
        httpRequest.body(requestParams.toString());
        Response response1 = httpRequest.post("/post");
        System.out.println("The status received: " + response1.statusLine());

    }
}