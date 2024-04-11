package com.example.user_reg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

//import com.example.user_reg.entity.UserPK;
import com.example.user_reg.entity.User_Model;

public interface UserService {
	
	
	public abstract List<User_Model> getUserData();
	
	public abstract List<User_Model> postUserData(User_Model data);
	
	
	
	public abstract User_Model updateUserData(User_Model data);
	
	public abstract List<User_Model> deleteUserData(int z);
	
	
//	public abstract String imageData(MultipartFile image);
	
	public abstract Optional<User_Model> getAuthData(String x);


}


