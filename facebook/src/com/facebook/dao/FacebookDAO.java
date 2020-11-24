package com.facebook.dao;

import com.facebook.entity.FacebookUser;

public class FacebookDAO implements FacebookDAOInterface{
	
	static FacebookUser f[]=new FacebookUser[10];
	static int counter=0;
	
	public FacebookDAO() {
		//f=;
	}

	@Override
	public int createProfileDAO(FacebookUser fu) throws Exception {
		int i=0;
		
		f[counter]=fu;
		counter++;
		System.out.println(counter);
		
		if(fu.getName().equals("mridula")) {
			i=1;
		}
		return i;
	}

	@Override
	public void viewProfileDAO() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProfileDAO() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editProfileDAO() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchProfileDAO() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FacebookUser[] viewAllProfileDAO() throws Exception {
		System.out.println(f[0].getAddress());
		return f;
		
	}

}

















