package com.facebook.controller;

public interface FacebookControllerInterface {
	public void createProfile()throws Exception;
	public void viewProfile()throws Exception;

	public void deleteProfile()throws Exception;
	void editProfile()throws Exception;

	void searchProfile()throws Exception;

	public void viewAllProfile()throws Exception;
	
	int portno=9090; //variable of an interface by default will be public static and final
	
	default public void myMethod() {
		System.out.println("hello");
	}
	
	public static void myMethod1() {
		System.out.println("hello");
	}
}
