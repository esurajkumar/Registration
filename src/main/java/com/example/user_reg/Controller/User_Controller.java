package com.example.user_reg.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.user_reg.entity.User_Model;
import com.example.user_reg.service.UserService;



// @CrossOrigin   to connect Java from React by Axios-Request

@RestController
@CrossOrigin   
public class User_Controller {
	

	
@Autowired
UserService obj;


	
@GetMapping("/getUserData")
public List<User_Model> get() {
		
     return obj.getUserData();
	}


@PostMapping ("/createUserData")
public List<User_Model> post(@RequestBody User_Model data){
		
	return obj.postUserData(data);
	
}



@PutMapping("/updateUserData")
public User_Model update(@RequestBody User_Model data){
	
	return obj.updateUserData(data);
		
}



@DeleteMapping("/deleteUserData")
public List<User_Model> delete(@RequestParam int id){
	
	return obj.deleteUserData(id);	
}



@GetMapping("/authentitaion")
public Optional<User_Model> auth(@RequestParam String id) {
	
	
return obj.getAuthData(id);
	}







//@PostMapping ("/insertImage")
//public ResponseEntity<String> insertImage(@RequestParam("file") MultipartFile file){
//	
//	if(file.isEmpty()) {
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Please attached the file first!");
//	}
////	System.out.println(file.getOriginalFilename());
////	System.out.println(file.getSize());
////	System.out.println(file.isEmpty());
//			
//	
//	return ResponseEntity.ok(obj.imageData(file));
//	
//
//}

}


