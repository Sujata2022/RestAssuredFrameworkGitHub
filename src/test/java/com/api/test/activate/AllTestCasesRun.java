package com.api.test.activate;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

import static io.restassured.RestAssured.get;
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

public class AllTestCasesRun {

	private static String token="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";
	private static String owner="Sujata2020";


	@BeforeTest
	public void setUp() {
		RestAssured.baseURI="https://api.github.com";
	}

	@Test
	public void getAllRecords() {

		List<GetAllRepoPOJO> listofUser = RestAssured
				.given()
				.header("Authorization", "Bearer " + token)
				.when()
				.get("/user/repos").as(new TypeRef<List<GetAllRepoPOJO>>() {});

		Response response = get("baseURI");	
		System.out.println("Total no of records ="+listofUser.size());
		//res.prettyPrint();	

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}	

	@Test	
	public void getSingleRepo() {
		GetAllRepoPOJO singleRepo = RestAssured
				.given()
				.header("Authorization", "Bearer " + token)
				.when()
				.get("/user/repos").as(new TypeRef<GetAllRepoPOJO>() {});

		Response response = get("baseURI");	

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}

	@Test	
	public void getNonExisRepo() {
	GetAllRepoPOJO singleRepo = RestAssured
	.given()
	.header("Authorization", "Bearer " + token)
	.when()
	.get("/user/repos").as(new TypeRef<GetAllRepoPOJO>() {});

	Response response = get("baseURI");	

	int statusCode = response.getStatusCode();
	Assert.assertEquals(statusCode, 404);

	}

	//	
	//	@Test	
	//	public void createRepo() {
	//	List<CreateNewRepoPOJO> createUser = RestAssured
	//			.given()
	//			.contentType(ContentType.JSON)
	//			.header("Authorization", "Bearer " + token)
	//			.body() //serialization
	//			.when()
	//			.post("/addData").as(new TypeRef<List<CreateNewRepoPOJO>>() {});
	//	}

	//	.extract().path("name already exists on this account");


	//	@Test	
	//	public void DeleteRep() {
	
	//	List<CreateNewRepoPOJO> delete = RestAssured
	//			.given()
	//			.contentType(ContentType.JSON)
	//			.header("Authorization", "Bearer " + token)
	//			.body() //serialization
	//			.when()
	//			.post("/addData").as(new TypeRef<List<CreateNewRepoPOJO>>() {});
	//	}
	//	public void DeleteNonExitRep() {
	
	//	List<CreateNewRepoPOJO> createUser = RestAssured
	//			.given()
	//			.contentType(ContentType.JSON)
	//			.header(header
	//			.body() //serialization
	//			.when()
	//			.post("/addData").as(new TypeRef<List<CreateNewRepoPOJO>>() {});
	//	}
	
	//	@Test	
	//	public void DeleteNonExitRepo() {

	//	List<CreateNewRepoPOJO> createUser = RestAssured
	//			.given()
	//			.contentType(ContentType.JSON)
	//			.header(header)
	//			.body() //serialization
	//			.when()
	//			.post("/addData").as(new TypeRef<List<CreateNewRepoPOJO>>() {});
	//	}


	//	@Test	
	//	public void UpdateRep() {
	//	Header header=new Header("owner", owner);	
	//	List<CreateNewRepoPOJO> createUser = RestAssured
	//			.given()
	//			.contentType(ContentType.JSON)
	//			.header(header)
	//			.auth().oauth2(mytoken)
	//			.body() //serialization
	//			.when()
	//			.post("/addData").as(new TypeRef<List<CreateNewRepoPOJO>>() {});
	//	}
	//
}
