package com.api.test.activate;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;  

import static org.hamcrest.Matchers.*;

import org.apache.groovy.parser.antlr4.util.StringUtils;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.api.model.response.CreateNewRepoPOJO;
import com.api.model.response.GetAllRepoPOJO;


import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UserTest {

	private static String mytoken="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";	

	@BeforeTest
	public void setUp() {
		RestAssured.baseURI="https://api.github.com";
	}
	
	@Test
	public void getAllRecords() {
		Header header=new Header("token",mytoken);
		List<GetAllRepoPOJO> listofUser = RestAssured
				.given()
				.header(header)
				.when()
				.get("/user/repos").as(new TypeRef<List<GetAllRepoPOJO>>() {});

		System.out.println("Total no of records ="+listofUser.size());
		//res.prettyPrint();	
	}	
	
	@Test
	
	public void create() {
	Header header=new Header("token",mytoken);	
	List<CreateNewRepoPOJO> createUser = RestAssured
			.given()
			.contentType(ContentType.JSON)
			.header(header)
			//.auth().oauth2(mytoken)
			.body() //serialization
			.when()
			.post("/addData").as(new TypeRef<List<CreateNewRepoPOJO>>() {});

	
//	
//	for 
//	.extract().path("name already exists on this account");
	
}

}
