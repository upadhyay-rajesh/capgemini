package com.facebook.dao;

import java.util.ArrayList;
import java.util.Map;

import com.facebook.entity.FacebookUser;

public interface FacebookDAOInterface {
	public int createProfileDAO(FacebookUser fu)throws Exception;
	public FacebookUser viewProfileDAO(FacebookUser fu)throws Exception;

	public void deleteProfileDAO()throws Exception;
	void editProfileDAO()throws Exception;

	void searchProfileDAO()throws Exception;

	public ArrayList<FacebookUser> viewAllProfileDAO()throws Exception;
	public Map<String, Object> getAll();
}
