package com.wppapi.service;

import org.springframework.stereotype.Service;

import com.wppapi.entities.Language;
import com.wppapi.entities.MessageTemplate;
import com.wppapi.entities.Template;
import com.wppapi.entities.dto.MessageTemplateDto;

@Service
public class MessageTemplateService {
	public MessageTemplate instantiate(MessageTemplateDto body) {
		Language lang = new Language(body.getCode());
		Template temp = new Template(body.getName(), lang);
		return new MessageTemplate(body.getMessaging_product(), body.getTo(), body.getType(), temp);
	}
}
