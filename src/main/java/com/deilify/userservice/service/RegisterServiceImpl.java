package com.deilify.userservice.service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.MessageAttributeValue;
import com.deilify.userservice.dao.UserCreateDao;
import com.deilify.userservice.dto.UserCreateDTO;
import com.deilify.userservice.dto.UserDTO;
import com.deilify.userservice.entity.UserEntity;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	UserCreateDao userCreateDao;

	public UserCreateDTO createUser(UserDTO user) {
		if (user.getUsername() != null) {
			UserEntity userCreateDTO = userCreateDao.findByUserName(user.getUsername());
			if (userCreateDTO == null) {
				UserEntity userEntity = new UserEntity();
				userEntity.setUsername(user.getUsername());
				userEntity.setFirstName(user.getFirstName());
				userEntity.setLastName(user.getLastName());
				userEntity.setPhone(user.getPhone());
				userEntity.setPassword(user.getPassword());
				userEntity.setCreatedTimestamp(LocalDate.now());
				userEntity.setUpdatedTimestamp(LocalDate.now());
				userEntity.setModifiedBy("System");

				userCreateDao.save(userEntity);
				System.out.println("User has been successfully registered");
				return mapUserToDto(user);
			} else {
				System.out.println("UserId is already present");
			}
		}
		System.out.println("UserId is already present");
		return null;
	}

	private UserCreateDTO mapUserToDto(UserDTO user) {
		UserEntity newUser = userCreateDao.findByUserName(user.getUsername());
		UserCreateDTO myNewUser = new UserCreateDTO();

		if (newUser.getUsername() != null) {
			if (newUser.getUserId() != null) {
				myNewUser.setUserId(newUser.getUserId().toString());
			}
			if (user.getUsername() != null) {
				myNewUser.setUsername(user.getUsername());
			}
			if (user.getPassword() != null) {
				myNewUser.setPassword(user.getPassword());
			}
			if (user.getFirstName() != null) {
				myNewUser.setFirstName(user.getFirstName());
			}
			if (user.getLastName() != null) {
				myNewUser.setLastName(user.getLastName());
			}
			if (user.getPhone() != null) {
				myNewUser.setPhone(user.getPhone());
			}

			myNewUser.setModified_By("System");
			myNewUser.setCreatedTimestamp(LocalDate.now());
			myNewUser.setUpdatedTimestamp(LocalDate.now());
		}

		return myNewUser;
	}

	@Override
	public UserCreateDTO updateUser(UserDTO user) {
		
		
		if (user.getUsername() != null) {
			UserEntity userUpdateDTO = userCreateDao.findByUserName(user.getUsername());
			
			if(userUpdateDTO != null) {
				if(!isBlankNullEmpty(user.getFirstName())) {
					userUpdateDTO.setFirstName(user.getFirstName());
				}
				if(!isBlankNullEmpty(user.getLastName())) {
					userUpdateDTO.setFirstName(user.getLastName());
				}
				if(!isBlankNullEmpty(user.getLastName())) {
					userUpdateDTO.setLastName(user.getLastName());
				}
				if(!isBlankNullEmpty(user.getPhone())) {
					userUpdateDTO.setPhone(user.getPhone());
				}
				if(!isBlankNullEmpty(user.getPhone())) {
					userUpdateDTO.setPhone(user.getPhone());
				}
				if(!isBlankNullEmpty(user.getPassword())) {
					userUpdateDTO.setPassword(user.getPassword());
				}
				userUpdateDTO.setUpdatedTimestamp(LocalDate.now());
				userUpdateDTO.setModifiedBy("System");
				userCreateDao.save(userUpdateDTO);
				
			}
		}
		return mapUserToDto(user);
	}
	
	private boolean isBlankNullEmpty(String parameter) {
		boolean isEmpty = false;
		if(parameter.isBlank() || parameter.isEmpty() || parameter == null) {
			isEmpty = true;
		}
		return isEmpty;
	}

}
