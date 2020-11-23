package com.facebook.service;

import com.facebook.entity.FacebookUser;

public interface FacebookServiceInterface {
	public int createProfileService(FacebookUser fu)throws Exception;
	public void viewProfileService()throws Exception;

	public void deleteProfileService()throws Exception;
	void editProfileService()throws Exception;

	void searchProfileService()throws Exception;

	public void viewAllProfileService()throws Exception;
}
