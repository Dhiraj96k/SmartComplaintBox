package com.example.smartcomlaintbox.complaintbox.entites;

import jakarta.persistence.*;

import java.math.BigDecimal;

import java.time.LocalDateTime;

@Entity
public class Complaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cid;

    private String ctype;
    private String cdesc;

    @Column(name = "created_time")
    private LocalDateTime createdTime;

    @Column(name = "expected_time")
    private LocalDateTime expectedTime;

    private String status;

    @Column(precision = 10, scale = 8)
    private BigDecimal latitude;

    @Column(precision = 11, scale = 8)
    private BigDecimal longitude;

    private String lname;

    @Column(name = "imagepath")
    private String imagePath;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uid", referencedColumnName = "uid", nullable = false)
    private User user;

	public Complaint() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Complaint(Integer cid, String ctype, String cdesc, LocalDateTime createdTime, LocalDateTime expectedTime,
			String status, BigDecimal latitude, BigDecimal longitude, String lname, String imagePath, User user) {
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

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
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

	@Override
	public String toString() {
		return "Complaint [cid=" + cid + ", ctype=" + ctype + ", cdesc=" + cdesc + ", createdTime=" + createdTime
				+ ", expectedTime=" + expectedTime + ", status=" + status + ", latitude=" + latitude + ", longitude="
				+ longitude + ", lname=" + lname + ", imagePath=" + imagePath + ", user=" + user + "]";
	}

    
    
}
