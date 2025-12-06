package com.example.smartcomlaintbox.complaintbox.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.smartcomlaintbox.complaintbox.entites.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {
    Optional<Admin> findByAemailAndApass(String mail, String pass);

    Optional<Admin> findByAmobileAndApass(long mob, String pass);
}
