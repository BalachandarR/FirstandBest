package com.best;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.service.one.model.Strudent;

@RestController
public class Controller {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/test/hello")
	public Strudent testController() {

		return getStudentDetails();

	}

	private Strudent getStudentDetails() {
		
		ResponseEntity<Strudent> response = restTemplate.getForEntity("http://laptop-ai358gdm:9090/Student/2/details", Strudent.class);
		return response.getBody();
	}

}
