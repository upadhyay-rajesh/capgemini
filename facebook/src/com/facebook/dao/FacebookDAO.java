package com.facebook.dao;

import com.facebook.entity.FacebookUser;

public class FacebookDAO implements FacebookDAOInterface{

	@Override
	public int createProfileDAO(FacebookUser fu) throws Exception {
		int i=0;
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
	public void viewAllProfileDAO() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
