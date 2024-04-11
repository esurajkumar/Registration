package com.example.user_reg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.user_reg.jpaRepo.UserDao;

@SpringBootApplication
public class RegistrationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext obj = SpringApplication.run(RegistrationApplication.class, args);
	
//	 UserDao userDao = obj.getBean(UserDao.class);
//	userDao.createTable();
		
		
		
	
	System.out.println("Winter is Coming on Mars!");
	}

}
