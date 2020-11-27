package com.facebook.service;

import com.facebook.entity.FacebookUser;

public interface FacebookServiceInterface {
	public int createProfileService(FacebookUser fu)throws Exception;
	public FacebookUser viewProfileService(FacebookUser fu)throws Exception;

	public void deleteProfileService()throws Exception;
	void editProfileService()throws Exception;

	void searchProfileService()throws Exception;

	public FacebookUser[] viewAllProfileService()throws Exception;
}
