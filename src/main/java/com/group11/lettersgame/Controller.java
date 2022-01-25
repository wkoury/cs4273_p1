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

		System.out.println("This is an HTTP request to /api/english");

		// This is filler code to make the compiler happy temporarily
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/api/spanish")
	public ResponseEntity<HttpStatus> getSpanish() {
				// 1. Read the Spanish CSV file
		// 2. Send the random number and the corresponding letter in JSON format

		System.out.println("This is an HTTP request to /api/spanish");

		// This is filler code to make the compiler happy temporarily
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/api/igbo")
	public ResponseEntity<HttpStatus> getIgbo() {
				// 1. Read the Igbo CSV file
		// 2. Send the random number and the corresponding letter in JSON format

		System.out.println("This is an HTTP request to /api/igbo");

		// This is filler code to make the compiler happy temporarily
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/api/yoruba")
	public ResponseEntity<HttpStatus> getYoruba() {
				// 1. Read the Yoruba CSV file
		// 2. Send the random number and the corresponding letter in JSON format

		System.out.println("This is an HTTP request to /api/yoruba");

		// This is filler code to make the compiler happy temporarily
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/api/hausa")
	public ResponseEntity<HttpStatus> getHausa() {
		// 1. Read the Hausa CSV file
		// 2. Send the random number and the corresponding letter in JSON format

		System.out.println("This is an HTTP request to /api/hausa");

		// This is filler code to make the compiler happy temporarily
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
