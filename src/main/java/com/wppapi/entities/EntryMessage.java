package com.wppapi.entities;

public class EntryMessage {
 
    private Entry entry;
    private String object;

    public EntryMessage() {

    }
    public EntryMessage(Entry entry, String object) {
        super();
        this.entry = entry;
        this.object = object;
    }

    public Entry getEntry() {
        return entry;
    }
    public void setEntry(Entry entry) {
        this.entry = entry;
    }
    public String getObject() {
        return object;
    }
    public void setObject(String object) {
        this.object = object;
    }
}