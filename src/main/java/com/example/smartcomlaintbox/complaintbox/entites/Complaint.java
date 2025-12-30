package com.example.smartcomlaintbox.complaintbox.entites;

import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity
public class Complaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cid;

    private String ctype;

    private String cdesc;

    private LocalDateTime createdTime;

    private LocalDateTime expectedTime;

    private String status;

    private Double latitude;

    private Double longitude;

    private String lname;

    private String imagePath;

    // Many Complaints → One User
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Uid", foreignKey = @ForeignKey(name = "fk_user_complaint"))
    private User user;
    
    
    

	public Complaint() {
	}

	public Complaint(Integer cid, String ctype, String cdesc, LocalDateTime createdTime, LocalDateTime expectedTime,
			String status, Double latitude, Double longitude, String lname, String imagePath, User user) {
		super();
		this.cid = cid;
		this.ctype = ctype;
		this.cdesc = cdesc;
		this.createdTime = createdTime;
		this.expectedTime = expectedTime;
		this.status = status;
		this.latitude = latitude;
		this.longitude = longitude;
		this.lname = lname;
		this.imagePath = imagePath;
		this.user = user;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	public String getCdesc() {
		return cdesc;
	}

	public void setCdesc(String cdesc) {
		this.cdesc = cdesc;
	}

	public LocalDateTime getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(LocalDateTime createdTime) {
		this.createdTime = createdTime;
	}

	public LocalDateTime getExpectedTime() {
		return expectedTime;
	}

	public void setExpectedTime(LocalDateTime expectedTime) {
		this.expectedTime = expectedTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

    
    
}
