package com.wppapi.entities;

public class MessageTemplate {

    private String messaging_product;
    private String to;
    private String type;

    private Template template;
    
    public MessageTemplate() {
    	
    }
    //Contructor to MessageSender
	public MessageTemplate(String messaging_product, String to, String type, Template temp) {
		this.messaging_product = messaging_product;
		this.to = to;
		this.type = type;
		this.template = temp;
	}

	public String getMessaging_product() {
        return messaging_product;
    }
 
    public void setMessaging_product(String messaging_product) {
        this.messaging_product = messaging_product;
    }
 
    public String getTo() {
        return to;
    }
 
    public void setTo(String to) {
        this.to = to;
    }
 
    public String getType() {
        return type;
    }
 
    public void setType(String type) {
        this.type = type;
    }
 
    public Template getTemplate() {
        return template;
    }
 
    public void setTemplate(Template template) {
        this.template = template;
    }
}