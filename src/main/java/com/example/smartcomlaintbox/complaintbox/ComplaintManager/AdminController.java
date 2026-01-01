package com.example.smartcomlaintbox.complaintbox.ComplaintManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.smartcomlaintbox.complaintbox.entites.Admin;
import com.example.smartcomlaintbox.complaintbox.services.AdminServices;

@RestController
public class AdminController {

    @Autowired
    AdminServices adminServices;

    @PostMapping("/admins")
    public ResponseEntity<Admin> saveAdmin(@RequestBody Admin admin) {
        Admin savedAdmin = adminServices.addAdmin(admin);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedAdmin);
    }

    @GetMapping("/getAdmin")
    public ResponseEntity<?> GetAdmin(@RequestParam String mail, @RequestParam String pass) {
        int result = adminServices.FindAdmin(mail, pass);
        if (result == 1)
            return ResponseEntity.status(HttpStatus.FOUND).build();
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @GetMapping("/getAdminmob")
    public ResponseEntity<?> getAdmin(
            @RequestParam long mob,
            @RequestParam String pass) {

        int result = adminServices.FindAdmin(mob, pass);

        if (result == 1) {
            return ResponseEntity.status(HttpStatus.FOUND).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
