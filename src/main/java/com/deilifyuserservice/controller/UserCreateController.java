package com.deilifyuserservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deilify.userservice.dto.UserDTO;
import com.deilifyuserservice.service.RegisterService;

@RestController
@RequestMapping(value = "/api")
public class UserCreateController {
	
	@Autowired
	RegisterService registerService;
	
	@PostMapping(value = "/registerUser")
	public ResponseEntity<UserDTO> registerUser (@RequestBody UserDTO user ){
//		return new ResponseEntity<>(registerService.createUser(user), HttpStatus.OK);
		return null;
		
	}

}
