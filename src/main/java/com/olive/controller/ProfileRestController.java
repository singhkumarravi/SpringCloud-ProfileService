package com.olive.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class ProfileRestController {

	@RequestMapping("/msg")
	public ResponseEntity<String> data(){
		
		return new ResponseEntity<String>("WELCOME TO PRODUCER APP", HttpStatus.OK);
	}
}
