package com.facebook.dao;

import com.facebook.entity.FacebookUser;

public interface FacebookDAOInterface {
	public int createProfileDAO(FacebookUser fu)throws Exception;
	public FacebookUser viewProfileDAO(FacebookUser fu)throws Exception;

	public void deleteProfileDAO()throws Exception;
	void editProfileDAO()throws Exception;

	void searchProfileDAO()throws Exception;

	public FacebookUser[] viewAllProfileDAO()throws Exception;
}
