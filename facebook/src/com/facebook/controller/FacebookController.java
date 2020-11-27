package com.facebook.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.facebook.entity.FacebookUser;
import com.facebook.service.FacebookService;
import com.facebook.service.FacebookServiceInterface;

public class FacebookController implements FacebookControllerInterface{

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
		
		//here name,password,email,address we will set inside entity class and pass it to service layer
		
		FacebookUser fu=new FacebookUser();
		fu.setName(name);
		fu.setPassword(password);
		fu.setEmail(email);
		fu.setAddress(address);
		
		
		
	//	System.out.println("your information is below");
		//System.out.println(name+"  "+password+"  "+email+"  "+address);
		
		FacebookServiceInterface fs=new FacebookService();
		int i=fs.createProfileService(fu);
		
		if(i>0) {
			System.out.println("Registration Success");
		}
		else {
			System.out.println("could not register");
		}
	}

	public void viewProfile()throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your name");
		String name=br.readLine();
		
		FacebookUser fu=new FacebookUser();
		fu.setName(name);
		
		FacebookServiceInterface fs=new FacebookService();
		FacebookUser i=fs.viewProfileService(fu);
		
		if(i!=null) {
			System.out.println("record found");
			System.out.println("name is "+i.getName()+"  password is "+i.getPassword());
		}
		
	}

	public void deleteProfile()throws Exception {

	}

	public void editProfile()throws Exception {

	}

	public void searchProfile()throws Exception {

	}

	public void viewAllProfile() throws Exception{
		FacebookServiceInterface fs=new FacebookService();
		FacebookUser[] ff=fs.viewAllProfileService();
		
		for(FacebookUser f1:ff) {
			if(f1!=null) {
			System.out.println("Name is "+f1.getName());
			System.out.println("Email is "+f1.getEmail());
			System.out.println("Address is "+f1.getAddress());
			}
		}
	}
	public void myMethod() {
		System.out.println("cvbcfb");
	}
}





