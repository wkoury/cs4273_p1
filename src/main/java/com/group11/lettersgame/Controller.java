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
}
