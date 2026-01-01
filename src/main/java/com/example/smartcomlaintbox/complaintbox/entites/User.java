package com.example.smartcomlaintbox.complaintbox.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User{
	
	@Id
	private String uId;

	private String uFullName;
	
	private String uEmail;
	
	private Long uMobile;
	
	private Integer uAge;
	
	private Long uPincode;
	
	private String uCity;
	
	private String uPassword;
	
}