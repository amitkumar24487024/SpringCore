package com.spring.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int id;
	private String name;
	private String location;

	@Autowired
	private Address address;

	private List<String> listOfLang;

	
	private List<String> visitedCountries;

	public Student() {
	}

	public Student(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", location=" + location + ", address=" + address + "]";
	}

	public List<String> getListOfLang() {
		return listOfLang;
	}

	public void setListOfLang(List<String> listOfLang) {
		this.listOfLang = listOfLang;
	}

	public List<String> getVisitedCountries() {
		return visitedCountries;
	}

	public void setVisitedCountries(List<String> visitedCountries) {
		this.visitedCountries = visitedCountries;
	}

}
