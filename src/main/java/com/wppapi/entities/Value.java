package com.wppapi.entities;

public class Value {
    private String verb;
    private String object_id;

    public Value() {

    }
    public Value(String verb, String object_id) {
        super();
        this.verb = verb;
        this.object_id = object_id;
    }

    public String getVerb() {
        return verb;
    }
    public void setVerb(String verb) {
        this.verb = verb;
    }
    public String getObject_id() {
        return object_id;
    }
    public void setObject_id(String object_id) {
        this.object_id = object_id;
    }
}
