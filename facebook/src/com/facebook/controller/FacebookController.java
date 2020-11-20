package com.facebook.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.facebook.service.FacebookService;
import com.facebook.service.FacebookServiceInterface;

public class FacebookController implements FacebookControllerInterface{

	public void createProfile()throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your name");
		String name=br.readLine();
		System.out.println(FacebookControllerInterface.portno);
		//portno=56;
		
		FacebookControllerInterface.myMethod1();
		
		System.out.println("enter your password");
		String password=br.readLine();
		
		System.out.println("enter your email");
		String email=br.readLine();
		
		System.out.println("enter your address");
		String address=br.readLine();
		
		System.out.println("your information is below");
		System.out.println(name+"  "+password+"  "+email+"  "+address);
		
		FacebookServiceInterface fs=new FacebookService();
	}

	public void viewProfile()throws Exception {

	}

	public void deleteProfile()throws Exception {

	}

	public void editProfile()throws Exception {

	}

	public void searchProfile()throws Exception {

	}

	public void viewAllProfile() throws Exception{

	}
	public void myMethod() {
		System.out.println("cvbcfb");
	}
}





