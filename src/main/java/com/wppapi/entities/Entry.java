package com.wppapi.entities;

import java.util.ArrayList;
import java.util.List;
 
public class Entry {
    private Integer time;
    private List<Change> changes = new ArrayList<>();
    private String id;
    private String uid;

    public Entry() {

    }
    public Entry(Integer time, String id, String uid) {
        super();
        this.time = time;
        this.id = id;
        this.uid = uid;
    }


    public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	public List<Change> getChanges() {
        return changes;
    }
    public void setChanges(List<Change> changes) {
        this.changes = changes;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUid() {
        return uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }
}
