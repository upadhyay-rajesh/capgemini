package com.facebook.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FacebookController {

	public void createProfile()throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your name");
		String name=br.readLine();
		
		System.out.println("enter your password");
		String password=br.readLine();
		
		System.out.println("enter your email");
		String email=br.readLine();
		
		System.out.println("enter your address");
		String address=br.readLine();
		
		System.out.println("your information is below");
		System.out.println(name+"  "+password+"  "+email+"  "+address);
	}

	public void viewProfile() {

	}

	public void deleteProfile() {

	}

	public void editProfile() {

	}

	public void searchProfile() {

	}

	public void viewAllProfile() {

	}
}
