package com.example.smartcomlaintbox.complaintbox.ComplaintManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.smartcomlaintbox.complaintbox.entites.User;
import com.example.smartcomlaintbox.complaintbox.services.UserServices;

@RestController
public class UserController {

	@Autowired
	private UserServices UserServices;
	
	@PostMapping("/AddUser")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
	    User savedUser = UserServices.SaveUser(user);
	    System.out.println(savedUser);

	    if (savedUser == null) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	    }
	    return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
	}

	
}
