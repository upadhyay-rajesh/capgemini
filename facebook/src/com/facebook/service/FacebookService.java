package com.facebook.service;

import java.util.ArrayList;
import java.util.Map;

import com.facebook.dao.FacebookDAO;
import com.facebook.dao.FacebookDAOInterface;
import com.facebook.entity.FacebookUser;

public class FacebookService implements FacebookServiceInterface{

	@Override
	public int createProfileService(FacebookUser fu)  {
		// TODO Auto-generated method stub
		FacebookDAOInterface fd=new FacebookDAO();
		int i=fd.createProfileDAO(fu);
		return i;
	}

	@Override
	public FacebookUser viewProfileService(FacebookUser fu) throws Exception {
		FacebookDAOInterface fd=new FacebookDAO();
		return fd.viewProfileDAO(fu);
		
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
	public ArrayList<FacebookUser> viewAllProfileService() throws Exception {
		FacebookDAOInterface fd=new FacebookDAO();
		return fd.viewAllProfileDAO();
		
	}

	@Override
	public Map<String, Object> getAll() {
		FacebookDAOInterface fd=new FacebookDAO();
		return fd.getAll();
	}

}
