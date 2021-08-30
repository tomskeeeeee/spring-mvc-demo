package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

// set up request mapping
@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// add an initbinder - to convert/trim input strings
	// remove leading and trailing whitespace
	// resolve issue that allowed blank input to validate
	// this is called on EVERY web request coming into the controller
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		// true - means all blanks will be trimmed to null and won't validate
		// StringTrimmerEditor is part of the Spring API
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		// register custom editor
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("customer", new Customer());
		
		return "customer-form";
	}

	@RequestMapping("/processForm")
	// need to validate the customer object passed in - use @Valid annotation
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, 
			BindingResult theBindingResult) {
		if (theBindingResult.hasErrors()) {
			return "customer-form";
		}
		else {
			return "customer-confirmation";
		}
		
	}
}
