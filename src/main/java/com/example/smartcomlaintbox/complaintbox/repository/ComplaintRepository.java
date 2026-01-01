package com.example.smartcomlaintbox.complaintbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.smartcomlaintbox.complaintbox.entites.Complaint;

@Repository
public interface ComplaintRepository extends JpaRepository<Complaint, String>{

}
