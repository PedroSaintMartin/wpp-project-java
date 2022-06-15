package com.wppapi.entities;

public class Template {
    private String name;
    private Language language;

    public Template() {

    }
    public Template(String name, Language language) {
        super();
        this.name = name;
        this.language = language;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Language getLanguage() {
        return language;
    }
    public void setLanguage(Language language) {
        this.language = language;
    }



}
