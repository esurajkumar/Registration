package com.example.user_reg.jpaRepo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.user_reg.entity.User_Model;

import jakarta.transaction.Transactional;




@Repository
public interface UserDao extends JpaRepository<User_Model, Integer > {

	public Optional<User_Model> findByemail(String emailid);
	
	
	//@Query(value = "select * from Moon", nativeQuery = true)
//	@Query (value= "Create table Moon (IDs int, FirstName varchar(255), MiddleName varchar(255), LastName  varchar(255),Age int, Number int Unique, EamilID varchar(255) Unique ,Aadhar int Unique, BirthCert Boolean, AadharCert Boolean, Primary Key(IDs))",   nativeQuery = true)
//	@Modifying()
//    @Transactional
//	public void createTable();	
}
