package com.wppapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wppapi.entities.MessageTemplate;
import com.wppapi.entities.dto.MessageTemplateDto;
import com.wppapi.service.MessageTemplateService;

@RestController
public class WppController {
	@Autowired
	private MessageTemplateService service;
	@Value("${accessToken}")
	private String token;
	
	private static final String URL = "https://graph.facebook.com/v13.0/";
	
	@GetMapping("/phonesNumbersJson/{id}")
	public String phonesNumbersJson(@PathVariable String id) {
		return new RestTemplate().getForObject(URL + id + "?access_token=" + token, String.class);
	}

	@PostMapping("/messageSender/{id}")
	public ResponseEntity<MessageTemplate> messageSender(@PathVariable String id, @RequestBody MessageTemplateDto body) {
		MessageTemplate mt = service.instantiate(body);
		
		return new RestTemplate().postForEntity(URL + id + "/messages?access_token=" + token, mt, MessageTemplate.class);
	}
	
}