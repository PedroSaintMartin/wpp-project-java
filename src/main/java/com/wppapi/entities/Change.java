package com.wppapi.entities;

public class Change {
	 
    private String field;
    private Value value;

    public Change() {

    }
    public Change(String field, Value value) {
        super();
        this.field = field;
        this.value = value;
    }

    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }
    public Value getValue() {
        return value;
    }
    public void setValue(Value value) {
        this.value = value;
    }
}
