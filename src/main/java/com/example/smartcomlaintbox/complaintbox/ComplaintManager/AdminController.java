package com.example.smartcomlaintbox.complaintbox.ComplaintManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.smartcomlaintbox.complaintbox.entites.Admin;
import com.example.smartcomlaintbox.complaintbox.services.AdminServices;

@RestController
public class AdminController {

    @Autowired
    AdminServices adminServices;

    @PostMapping("/AddAdmin")
    public String SaveAdmin(@RequestBody Admin admin) {
        adminServices.addAdmin(admin);
        return "Save";
    }

}
