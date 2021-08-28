package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
// set up parent mapping (highest level)
// later request mappings will be relative to this
// ex: hello/showForm
// need to modify the main menu on the home page to ref: hello/showForm

@RequestMapping("/hello")
public class HelloWorldController {

	// controller method to show form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// controller method to process the HTML form data
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// new controller method to read form data
	// and add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShout(HttpServletRequest request, Model model) {
		
		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		// convert the data to all caps
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Who is the best? This guy: " + theName;
		
		// add the message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	
	// new controller method to read form data
		// and add data to the model
		@RequestMapping("/processFormVersionThree")
		public String letsShoutVersionThree(
				@RequestParam("studentName") String theName,
				 Model model) {
			
			// the following is not needed anymore
			// automatically read and bind data to "theName" variable
//			// read the request parameter from the HTML form
//			String theName = request.getParameter("studentName");
			
			// convert the data to all caps
			theName = theName.toUpperCase();
			
			// create the message
			String result = "Who is using version three? This guy: " + theName;
			
			// add the message to the model
			model.addAttribute("message", result);
			
			return "helloworld";
		}
}
