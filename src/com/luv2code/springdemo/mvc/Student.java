package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String state;
	private LinkedHashMap<String, String> stateOptions;
	private String favoriteLanguage;
	private String[] operatingSystems;
	private LinkedHashMap<String, String> favoriteLanguageOptions;

	public Student() {
		
		// populate state options 
		stateOptions = new LinkedHashMap<>();
		stateOptions.put("PA", "Pennsylvania");
		stateOptions.put("NJ", "New Jersey");
		stateOptions.put("NY", "New York");
		stateOptions.put("VA", "Virginia");
		stateOptions.put("FL", "Florida");
		stateOptions.put("GA", "Georgia");
		
	  	 // populate favorite language options
	   	 favoriteLanguageOptions = new LinkedHashMap<>();
	   	 // parameter order: value, display label
	   	 //
	   	 favoriteLanguageOptions.put("Java", "Java");
	   	 favoriteLanguageOptions.put("C#", "C#");
	   	 favoriteLanguageOptions.put("Python", "Python");
	   	 favoriteLanguageOptions.put("Ruby", "Ruby");   
	}
	
	public Student(String thefirstName, String thelastName) {
		firstName = thefirstName;
		lastName = thelastName;
	}
	
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
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	// when form is loaded, Spring will automatically call this
	public LinkedHashMap<String, String> getStateOptions() {
		return stateOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	
	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public void setFavoriteLanguageOptions(LinkedHashMap<String, String> favoriteLanguageOptions) {
		this.favoriteLanguageOptions = favoriteLanguageOptions;
	}

	
}
