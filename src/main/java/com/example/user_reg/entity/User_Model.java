package com.example.user_reg.entity;





import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Past;
import jakarta.persistence.EmbeddedId;


@Entity
@Table (name = "Mars", uniqueConstraints = {
	    @UniqueConstraint(columnNames = { "Email"})})
public class User_Model {
			
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column(name = "ID")
    private int id; 

@Column(name = "First Name")
	private String firstName;

@Column(name = "Last Name")
	private String lastName;

@Column(name = "Phone")
private String phone;

@Column(name = "DOB")
private String dob;


@Column(name = "Gender")
private String gender;

@Email(message = "Email format should be valid")
@Column(name = "Email")
private String email;

@Column(name = "Password")
private String password;




public User_Model() {
	super();
	// TODO Auto-generated constructor stub
}




public User_Model(int id, String firstName, String lastName, String phone, String dob, String gender,
		@Email(message = "Email format should be valid") String email, String password) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.phone = phone;
	this.dob = dob;
	this.gender = gender;
	this.email = email;
	this.password = password;
}




public int getId() {
	return id;
}




public void setId(int id) {
	this.id = id;
}




public String getFirstName() {
	return firstName;
}




public void setFirstName(String firstName) {
	this.firstName = firstName;
}




public String getLastName() {
	return lastName;
}




public void setLastName(String lastName) {
	this.lastName = lastName;
}




public String getPhone() {
	return phone;
}




public void setPhone(String phone) {
	this.phone = phone;
}




public String getDob() {
	return dob;
}




public void setDob(String dob) {
	this.dob = dob;
}




public String getGender() {
	return gender;
}




public void setGender(String gender) {
	this.gender = gender;
}




public String getEmail() {
	return email;
}




public void setEmail(String email) {
	this.email = email;
}




public String getPassword() {
	return password;
}




public void setPassword(String password) {
	this.password = password;
}




@Override
public String toString() {
	return "User_Model [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone
			+ ", dob=" + dob + ", gender=" + gender + ", email=" + email + ", password=" + password + "]";
}







	
	
	
	// *** Extra- 
	//@Column(name = "Age" )
	//@Min(value = 18, message = "You must be at least 18 years old")
	//@Past (message = "Date should not be the future date")
	//@DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
	//@JsonFormat(pattern = "YYYY-MM-dd", shape = Shape.STRING)
	//private LocalDate dob; 


//		@EmbeddedId
//		private UserPK userPk ;
		
	















}