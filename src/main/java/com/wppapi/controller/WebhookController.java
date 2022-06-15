package com.wppapi.controller;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wppapi.entities.dto.EntryMessageDto;
import com.wppapi.util.Sha1Util;


@RestController
public class WebhookController {
	@Value("${accessToken}")
	private String token;
	
	@GetMapping("/webhook")
    public ResponseEntity<Integer> webHookVerify(@RequestParam("hub.mode") String hub_mode, @RequestParam("hub.challenge") Integer hub_challenge, @RequestParam("hub.verify_token") String hub_verify_token) {
		System.out.println("passou");
		if(hub_verify_token == token) {
            return ResponseEntity.ok(hub_challenge);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	
	@PostMapping("/webhook")
	public void webHook(@PathVariable String sha1, @RequestBody EntryMessageDto body) throws NoSuchAlgorithmException {
		System.out.println(sha1);
		System.out.println(Sha1Util.sha1(body.toString() + token));
		System.out.println(body.toString());
		
		/*try {
			if(sha1 == Sha1Util.sha1(body.toString() + token)) {
				
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		*/
	}
}
