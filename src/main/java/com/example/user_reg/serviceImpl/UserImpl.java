package com.example.user_reg.serviceImpl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Optional;

//import com.example.user_reg.entity.UserPK;
import com.example.user_reg.entity.User_Model;
import com.example.user_reg.jpaRepo.UserDao;
import com.example.user_reg.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@Primary
public class UserImpl implements UserService {
	
	
	
	@Autowired
	 UserDao userDao;

	//fetching all the data from table
	@Override
	public List<User_Model> getUserData() {
		//userDao.createTable();
		return userDao.findAll();
	}

	
	
	
	public Optional<User_Model> getAuthData(String x) {
		
		
		return userDao.findByemail(x);
	}
	
	
	
	

//adding data into database table
	@Override
	public List<User_Model> postUserData(User_Model data) {
		//userDao.createTable();
		userDao.save(data);
		return userDao.findAll();
	}
	

	//updating the available data into database table
	@Override
	public User_Model updateUserData(User_Model data) {
		userDao.save(data);
		return data;
	}

	
	// deleting the data from database
	@Override
	public List<User_Model> deleteUserData(int z) {
		
		  userDao.deleteById(z);
		  return userDao.findAll();
	}


//	@Override
//	public String imageData( MultipartFile image) {
//
//       String location = "C:\\Users\\suraj.kumar26\\Documents\\workspace-spring-tool-suite-4-4.20.0.RELEASE\\Registration\\src\\main\\resources\\static\\image";
//		String message;
//try {
//	
//	
//	Files.copy(image.getInputStream(), Paths.get(location+File.separator+image.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
//       message = "File is successfully uploaded";
//
//} catch (IOException e) {
//	
//	e.printStackTrace();
//	message = "Error Occured!";	
//}
//
//
//
//return message;
//	}
}
