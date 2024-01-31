package com.deilify.userservice.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	
	private String username;
	
	private String password;
	
	private String first_name;
	
	private String last_name;
	
	private String phone;
	
	private LocalDate created_timestamp;
	
	private LocalDate updated_timestamp;
	
	private String modified_at;

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}

	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}

	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the updated_timestamp
	 */
	public LocalDate getUpdated_timestamp() {
		return updated_timestamp;
	}

	/**
	 * @param updated_timestamp the updated_timestamp to set
	 */
	public void setUpdated_timestamp(LocalDate updated_timestamp) {
		this.updated_timestamp = updated_timestamp;
	}

	/**
	 * @return the modified_at
	 */
	public String getModified_at() {
		return modified_at;
	}

	/**
	 * @param modified_at the modified_at to set
	 */
	public void setModified_at(String modified_at) {
		this.modified_at = modified_at;
	}

	/**
	 * @return the created_timestamp
	 */
	public LocalDate getCreated_timestamp() {
		return created_timestamp;
	}

	/**
	 * @param created_timestamp the created_timestamp to set
	 */
	public void setCreated_timestamp(LocalDate created_timestamp) {
		this.created_timestamp = created_timestamp;
	}

	/**
	 * @param userId
	 * @param username
	 * @param password
	 * @param first_name
	 * @param last_name
	 * @param phone
	 * @param created_timestamp
	 * @param updated_timestamp
	 * @param modified_at
	 */
	public UserEntity(Integer userId, String username, String password, String first_name, String last_name,
			String phone, LocalDate created_timestamp, LocalDate updated_timestamp, String modified_at) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone = phone;
		this.created_timestamp = created_timestamp;
		this.updated_timestamp = updated_timestamp;
		this.modified_at = modified_at;
	}

	/**
	 * 
	 */
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", username=" + username + ", password=" + password + ", first_name="
				+ first_name + ", last_name=" + last_name + ", phone=" + phone + ", created_timestamp="
				+ created_timestamp + ", updated_timestamp=" + updated_timestamp + ", modified_at=" + modified_at + "]";
	}

	

	
	
}
