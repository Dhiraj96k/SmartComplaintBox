package com.example.smartcomlaintbox.complaintbox.entites;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "users")
public class User {

    @Id
    private String uid; 

    private String ufullname;
    private String uemail;
    private long umobile;
    private int uage;
    private int upincode;
    private String ucity;

    private String password;

    private String ucpassword;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Complaint> complaints = new ArrayList<>();

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String uid, String ufullname, String uemail, long umobile, int uage, int upincode, String ucity,
			String password, String ucpassword, List<Complaint> complaints) {
		super();
		this.uid = uid;
		this.ufullname = ufullname;
		this.uemail = uemail;
		this.umobile = umobile;
		this.uage = uage;
		this.upincode = upincode;
		this.ucity = ucity;
		this.password = password;
		this.ucpassword = ucpassword;
		this.complaints = complaints;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUfullname() {
		return ufullname;
	}

	public void setUfullname(String ufullname) {
		this.ufullname = ufullname;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public long getUmobile() {
		return umobile;
	}

	public void setUmobile(long umobile) {
		this.umobile = umobile;
	}

	public int getUage() {
		return uage;
	}

	public void setUage(int uage) {
		this.uage = uage;
	}

	public int getUpincode() {
		return upincode;
	}

	public void setUpincode(int upincode) {
		this.upincode = upincode;
	}

	public String getUcity() {
		return ucity;
	}

	public void setUcity(String ucity) {
		this.ucity = ucity;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUcpassword() {
		return ucpassword;
	}

	public void setUcpassword(String ucpassword) {
		this.ucpassword = ucpassword;
	}

	public List<Complaint> getComplaints() {
		return complaints;
	}

	public void setComplaints(List<Complaint> complaints) {
		this.complaints = complaints;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", ufullname=" + ufullname + ", uemail=" + uemail + ", umobile=" + umobile
				+ ", uage=" + uage + ", upincode=" + upincode + ", ucity=" + ucity + ", password=" + password
				+ ", ucpassword=" + ucpassword + ", complaints=" + complaints + "]";
	}

}
