package com.facebook.service;

import com.facebook.dao.FacebookDAO;
import com.facebook.dao.FacebookDAOInterface;
import com.facebook.entity.FacebookUser;

public class FacebookService implements FacebookServiceInterface{

	@Override
	public int createProfileService(FacebookUser fu) throws Exception {
		// TODO Auto-generated method stub
		FacebookDAOInterface fd=new FacebookDAO();
		int i=fd.createProfileDAO(fu);
		return i;
	}

	@Override
	public void viewProfileService() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProfileService() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editProfileService() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchProfileService() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewAllProfileService() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
