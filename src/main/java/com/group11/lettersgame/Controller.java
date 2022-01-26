package com.group11.lettersgame;

import java.util.Map;
import java.util.HashMap;
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
	@GetMapping("/api/health")
	public ResponseEntity<HttpStatus> get() {
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/api/english")
	public Map<String, String> getEnglish() {
		// 1. Read the English CSV file
		// 2. Send the random number and the corresponding letter in JSON format

		System.out.println("This is an HTTP request to /api/english");
		CSVParser english = new CSVParser("english.csv");

		Letter l = english.getRandomLetter();

		HashMap<String, String> ret = new HashMap<String, String>();
		ret.put("letter", l.getLowercase());
		ret.put("number", Integer.toString(l.getIndexPlusOne()));

		return ret;
	}

	@GetMapping("/api/spanish")
	public Map<String, String> getSpanish() {
				// 1. Read the Spanish CSV file
		// 2. Send the random number and the corresponding letter in JSON format

		System.out.println("This is an HTTP request to /api/spanish");
		CSVParser spanish = new CSVParser("spanish.csv");

		Letter l = spanish.getRandomLetter();

		HashMap<String, String> ret = new HashMap<String, String>();
		ret.put("letter", l.getLowercase());
		ret.put("number", Integer.toString(l.getIndexPlusOne()));

		return ret;
	}

	@GetMapping("/api/igbo")
	public Map<String, String> getIgbo() {
				// 1. Read the Igbo CSV file
		// 2. Send the random number and the corresponding letter in JSON format

		System.out.println("This is an HTTP request to /api/igbo");
		CSVParser igbo = new CSVParser("igbo.csv");

		Letter l = igbo.getRandomLetter();

		HashMap<String, String> ret = new HashMap<String, String>();
		ret.put("letter", l.getLowercase());
		ret.put("number", Integer.toString(l.getIndexPlusOne()));

		return ret;
	}

	@GetMapping("/api/yoruba")
	public Map<String, String> getYoruba() {
				// 1. Read the Yoruba CSV file
		// 2. Send the random number and the corresponding letter in JSON format

		System.out.println("This is an HTTP request to /api/yoruba");
		CSVParser yoruba = new CSVParser("yoruba.csv");

		Letter l = yoruba.getRandomLetter();

		HashMap<String, String> ret = new HashMap<String, String>();
		ret.put("letter", l.getLowercase());
		ret.put("number", Integer.toString(l.getIndexPlusOne()));

		return ret;
	}

	@GetMapping("/api/hausa")
	public Map<String, String> getHausa() {
		// 1. Read the Hausa CSV file
		// 2. Send the random number and the corresponding letter in JSON format

		System.out.println("This is an HTTP request to /api/hausa");
		CSVParser hausa = new CSVParser("hausa.csv");

		Letter l = hausa.getRandomLetter();

		HashMap<String, String> ret = new HashMap<String, String>();
		ret.put("letter", l.getLowercase());
		ret.put("number", Integer.toString(l.getIndexPlusOne()));

		return ret;
	}
}
