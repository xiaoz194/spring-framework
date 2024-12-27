package com.evan.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class Person {
	private String name;

//	@Autowired
	private Cat cat;

	public String getName() {
		return name;
	}

	@Lookup
	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}


	public void setName(String name) {
		this.name = name;
	}
}
