package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	// method to show the form
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		// create a new student object
		Student theStudent = new Student();
		
		// add the student object as a model attribute
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		// when the form data is sent over, the data will populate this
		// student object, then we can access the data
		
		// log the input dat
		System.out.println("theStudent: " + theStudent.getFirstName() 
		+ " " + theStudent.getLastName());
		return "student-confirmation";
	}
}
