package com.tts.PersonalizedSite.ContactInfo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ContactInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long id;
	private String name;
	private String email;
	private String phone;
	private String message;
	
	public ContactInfo() {}
	public ContactInfo(String name, String email, String phone, String message) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.message = message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ContactInfo [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", message=" + message + "]";
	}
	
	
}
