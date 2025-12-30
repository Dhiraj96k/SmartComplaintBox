package com.example.smartcomlaintbox.complaintbox.entites;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Uid;

    private String ufullname;

    private String uemail;

    private long umobile;

    private int uage;

    private int upincode;

    private String ucity;

    private String passwaord;

    private String ucpassword;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Complaint> complaints = new ArrayList<>();
}
