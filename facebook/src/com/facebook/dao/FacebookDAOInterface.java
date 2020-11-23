package com.facebook.dao;

import com.facebook.entity.FacebookUser;

public interface FacebookDAOInterface {
	public int createProfileDAO(FacebookUser fu)throws Exception;
	public void viewProfileDAO()throws Exception;

	public void deleteProfileDAO()throws Exception;
	void editProfileDAO()throws Exception;

	void searchProfileDAO()throws Exception;

	public void viewAllProfileDAO()throws Exception;
}
