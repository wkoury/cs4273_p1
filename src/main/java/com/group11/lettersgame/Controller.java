package com.group11.lettersgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.security.Principal;

@RestController
@RequestMapping("/")
public class Controller {
	@GetMapping("/test")
	public ResponseEntity<HttpStatus> get() {
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/api/english")
	public ResponseEntity<HttpStatus> getEnglish() {
		// 1. Read the English CSV file
		// 2. Send the random number and the corresponding letter in JSON format
		//
		// This is filler code to make the compiler happy temporarily
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
