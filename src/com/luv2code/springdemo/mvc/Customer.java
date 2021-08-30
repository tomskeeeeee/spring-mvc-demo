package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

	private String firstName;
	
	// add validation rules
	@NotNull(message="is required")
	@Size(min=2, message="is required")
	private String lastName;
	
//	@Pattern(regexp="^[0-9]{1}", message="only numbers allowed")
	@Min(value=-1, message="must be 0 or greater")
	@Max(value=10, message="you can request 10 at the most")
	private int freePasses;
	
	// use regular expressions to validate zip code
	// 5 digits exactly
	@Pattern(regexp="^[0-9]{5}", message="5 digit postal code")
	private String zipCode;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
}
