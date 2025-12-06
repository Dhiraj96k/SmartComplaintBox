package com.example.smartcomlaintbox.complaintbox.services;

import java.util.Optional;

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

    public int FindAdmin(String mail, String pass) {
        Optional<Admin> admin = adminRepository.findByAemailAndApass(mail, pass);
        if (admin.isPresent())
            return 1;
        return 0;
    }

    public int FindAdmin(long mob, String pass) {
        Optional<Admin> admin = adminRepository.findByAmobileAndApass(mob, pass);
        if (admin.isPresent())
            return 1;
        return 0;
    }

}
