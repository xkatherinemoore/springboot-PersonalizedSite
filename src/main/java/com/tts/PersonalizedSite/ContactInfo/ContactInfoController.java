package com.tts.PersonalizedSite.ContactInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactInfoController {
	
	@Autowired
	private ContactInfoRepository contactInfoRepository;
	
	@GetMapping(value = "/")
	public String index() {
		return "index";
	}
	
	@GetMapping(value = "/projects")
	public String projects() {
		return "projects";
	}
	
	@GetMapping(value = "/contact")
	public String contact() {
		return "contact";
	}
	
	@PostMapping(value = "/contact")
	public String createNewContactMessage(ContactInfo contactInfo, Model model) {
		contactInfoRepository.save(new ContactInfo(contactInfo.getName(), contactInfo.getEmail(), contactInfo.getPhone(), contactInfo.getMessage()));

		model.addAttribute("name", contactInfo.getName());
		model.addAttribute("email", contactInfo.getEmail());
		model.addAttribute("phone", contactInfo.getPhone());
		model.addAttribute("message", contactInfo.getMessage());
		return "sendsuccess"; 
	} 
}
