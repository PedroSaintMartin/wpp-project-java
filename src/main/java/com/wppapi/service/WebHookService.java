package com.wppapi.service;

import org.springframework.stereotype.Service;

import com.wppapi.entities.Change;
import com.wppapi.entities.Entry;
import com.wppapi.entities.EntryMessage;
import com.wppapi.entities.Value;
import com.wppapi.entities.dto.EntryMessageDto;

@Service
public class WebHookService {
	public EntryMessage instantiate(EntryMessageDto body) {
		Value value = new Value(body.getVerb(), body.getObject_id());
		Change change = new Change(body.getField(), value);
		Entry entry = new Entry(body.getTime(), body.getId(), body.getUid());
		
		entry.getChanges().add(change);
		
		return new EntryMessage(entry, body.getObject());
	}
}
