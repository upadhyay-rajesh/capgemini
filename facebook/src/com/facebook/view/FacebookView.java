package com.facebook.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.facebook.controller.FacebookController;
import com.facebook.controller.FacebookControllerInterface;

public class FacebookView {

	public static void main(String[] args)throws Exception {
		String ss="y";
		while(ss.contentEquals("y")) {
		System.out.println("*****************************MAIN MENU********************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to delete profile");
		System.out.println("press 4 to edit profile");
		System.out.println("press 5 to search profile");
		System.out.println("press 6 to view All profile");
		System.out.println("press 7 to view All detail");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		/*
		System.out.println("enter your first no");
		String str=br.readLine();
		int i=Integer.parseInt(str);
		
		System.out.println("enter your second no");
		String str1=br.readLine();
		int j=Integer.parseInt(str1);
		*/
		
		FacebookControllerInterface fc=new FacebookController();
		
		System.out.println("enter your choice");
		String str=br.readLine();
		int i=Integer.parseInt(str);
		
		switch(i) {
		case 1: fc.createProfile();
			break;
		case 2:fc.viewProfile();
			break;
		case 3:fc.deleteProfile();
			break;
		case 4:fc.editProfile();
			break;
		case 5:fc.searchProfile();
			break;
		case 6:fc.viewAllProfile();
			break;
		case 7:fc.getAll();
		break;
		default:System.out.println("wrong choice");
		}
		System.out.println("do you want to continue press y/n");
		ss=br.readLine();
		}
	}

}







