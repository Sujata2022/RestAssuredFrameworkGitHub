package com.api.endpoints;

// Base url - https://api.github.com
//1. Get a single repository - (GET with autho)- /repos/:OWNER/:REPO
//2. -ve test case: Get a single repository with non existing repo name (GET with autho)-/repos/:OWNER/:REPO
//3. Get all repositories (GET)- /users/Sujata2022/repos
//4.Create the repo(POST with Autho)- /user/repos
//5.negative testcase:create the repo with existing name (POST with Autho)- /user/repos
//6.Update the repository name (PATCH with autho)- /repos/:OWNER/:REPO
//7.Delete the repo(DELETE with autho)- /repos/:OWNER/:REPO
//8.-ve testcase:delete the repo with non existing name (DELETE with autho)-/repos/:OWNER/:REPO

public class Routes {
	
	public static String base_url = "https://api.github.com";
	
	public static String post_url = base_url+"/user/repos";
	public static String get_all_url = base_url+"/user/repos";
	public static String get_url = base_url+"repos/OWNER/{owner}/REPO/{repo}";
	public static String update_url = base_url+"repos/OWNER/{owner}/REPO/{repo}";
	public static String delete_url = base_url+"repos/OWNER/{owner}/REPO/{repo}";
	
}
