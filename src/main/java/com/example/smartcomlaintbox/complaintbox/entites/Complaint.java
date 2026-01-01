package com.example.smartcomlaintbox.complaintbox.entites;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Complaint {

	@Id
	@Column(name = "c_id")
	public String cid;

	private String ctype;

	private String cdesc;

	private LocalDateTime createdTime;

	private LocalDateTime expectedTime;

	private String status;

	private float latitude;

	private float longitude;

	private String lname;

	private String imagePath;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "u_Id",nullable = false,foreignKey = @ForeignKey(name = "fk_entity_user"))
    private User user; 

}