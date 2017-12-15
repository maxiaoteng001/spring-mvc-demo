package com.maxiaoteng.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> favoriteLanguages;
	
	public Student() {
		// populate the countryOptions	
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("FR", "Franch");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("DE", "Germany");
		countryOptions.put("CN", "China");
		countryOptions.put("IN", "India");	
		countryOptions.put("US", "United States of America");
	
		//populate the favoriteLanguages
		favoriteLanguages = new LinkedHashMap<>();
		favoriteLanguages.put("Java", "Java");
		favoriteLanguages.put("C++", "C++");
		favoriteLanguages.put("Ruby","Ruby");
		favoriteLanguages.put("PHP","PHP");
	
	}
	
	
	public LinkedHashMap<String, String> getFavoriteLanguages() {
		return this.favoriteLanguages;
	}
	
	public String getFavoriteLanguage() {
		return this.favoriteLanguage;
	}



	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}



	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return this.countryOptions;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
