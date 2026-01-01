package com.example.smartcomlaintbox.complaintbox.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smartcomlaintbox.complaintbox.entites.Complaint;
import com.example.smartcomlaintbox.complaintbox.entites.User;
import com.example.smartcomlaintbox.complaintbox.repository.ComplaintRepository;
import com.example.smartcomlaintbox.complaintbox.repository.UserRepository;

@Service
public class UserServices {
	
	@Autowired
	private UserRepository UserRepository;
	
	@Autowired
	private ComplaintRepository complaintRepository;
	
	
	public User SaveUser(User User) {
		return UserRepository.save(User);
	}
	
	public Complaint makeComplaint(Complaint Complanit) {
		return complaintRepository.save(Complanit);
	}
	
}
