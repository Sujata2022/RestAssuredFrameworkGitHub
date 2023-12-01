//package com.api.endpoints;
//
//import static io.restassured.RestAssured.given;
//
//import com.api.payloads.User;
//
//import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//
////RepoEndPoint.java
////created to perform Create,Read,Update,Delete  request for repo
//
//public class RepoEndPoints {
//
//	public static Response createRepo(User payload)
//	{		
//		Response response=given()
//				.contentType(ContentType.JSON)
//				.accept(ContentType.JSON)
//				.body(payload)
//			.when()
//				.post(Routes.post_url);
//		
//		return response;
//	}
//	
//	public static Response readRepo(String Owner, String Repo)
//	{		
//		Response response=given()
//				.pathParam("owner", Owner)	
//				.pathParam("repo", Repo)
//			.when()
//				.get(Routes.get_url);
//		
//		return response;
//	}
//	public static Response readAllRepo(String Owner, String Repo)
//	{		
//		Response response=given()
//				.pathParam("owner", Owner)	
//				.pathParam("repo", Repo)
//			.when()
//				.get(Routes.get_all_url);
//		
//		return response;
//	}
//	
//	public static Response updateRepo(String Owner, String Repo, User payload )
//	{		
//		Response response=given()
//				.contentType(ContentType.JSON)
//				.accept(ContentType.JSON)
//				.pathParam("owner", Owner)	
//				.pathParam("repo", Repo)				
//				.body(payload)
//			.when()
//				.patch(Routes.update_url);
//		
//		return response;
//	}
//	
//	public static Response deleteRepo(String Owner, String Repo)
//	{		
//		Response response=given()
//				.pathParam("owner", Owner)	
//				.pathParam("repo", Repo)				
//
//			.when()
//				.delete(Routes.delete_url);
//		
//		return response;
//	}
//}
