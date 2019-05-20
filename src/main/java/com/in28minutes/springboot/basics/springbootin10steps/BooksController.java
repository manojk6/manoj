package com.in28minutes.springboot.basics.springbootin10steps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BooksController {
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return Arrays.asList(
				new Book(1l, "Mastering Spring 5.2", "Ranga Karanam"),
				new Book(12, "Mastering Spring 5.3", "Manojkumar"));
	}
	
	@GetMapping("/mans")
	public List getAllMans() {
		List a=new ArrayList<>();
		a.add("gilichrist");
		a.add("pointing");
		a.add("raju");
		a.add("ramu");
		return a;
	}
	
	@GetMapping("/Message")
	public String WelcomeMsg() {
		return "manoj kumar";
	}
		
	@GetMapping("/Mapdata")
	public String returnMap() {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
		  = "http://localhost:9200/mans";
		ResponseEntity<String> response
		  = restTemplate.getForEntity(fooResourceUrl, String.class);
//		m.put("hero","maheshbabu");
//		m.put("villan","Prakash raj");
//		m.put("comedian","ali");
		System.out.println("response"+response);
		String a=response.getBody();
		return a;
	}
	
	
	@GetMapping("/arraydata")
	public int[] returnArray() {
		int a[]={1,2,23,56,78,95};
		return a;
	}
	
	
}