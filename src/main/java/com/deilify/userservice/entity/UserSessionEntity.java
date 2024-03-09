package com.deilify.userservice.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "shoppingsession")
public class UserSessionEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "user_id")
	private Integer userId;
	
	@Column(name = "total")
	private Float total;
	
	@Column(name = "created_at")
	private LocalDate createdAt;
	
	@Column(name = "modifie_at")
	private LocalDate modifiedAt;
	
	@ManyToOne
	@JoinColumn(name = "user_entity_id", referencedColumnName = "userId", insertable = false, updatable = false)
	private UserEntity userEntity;
	

}
