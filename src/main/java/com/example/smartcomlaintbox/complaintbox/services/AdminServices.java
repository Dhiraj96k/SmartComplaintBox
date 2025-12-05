package com.example.smartcomlaintbox.complaintbox.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smartcomlaintbox.complaintbox.entites.Admin;
import com.example.smartcomlaintbox.complaintbox.repository.AdminRepository;

@Service
public class AdminServices {

    @Autowired
    AdminRepository adminRepository;

    public Admin addAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

}
