package com.example.smartcomlaintbox.complaintbox.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {

    @Id
    private String aemail;

    private Long amobile;
    private String apass;

    public Admin() {
    }

    public Admin(String aemail, Long amobile, String apass) {
        this.aemail = aemail;
        this.amobile = amobile;
        this.apass = apass;
    }

    public String getAemail() {
        return aemail;
    }

    public void setAemail(String aemail) {
        this.aemail = aemail;
    }

    public Long getAmobile() {
        return amobile;
    }

    public void setAmobile(Long amobile) {
        this.amobile = amobile;
    }

    public String getApass() {
        return apass;
    }

    public void setApass(String apass) {
        this.apass = apass;
    }

}
