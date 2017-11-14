package com.matrimony.dao;

import java.util.List;

import com.matrimony.bean.Profile;

public interface ProfileDAO {
	
	boolean addProfile(Profile profile);
	List<Profile> getProfileByGender(String gender);
}
