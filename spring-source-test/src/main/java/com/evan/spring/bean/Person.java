package com.evan.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

@Component
public class Person implements ApplicationContextAware, MessageSourceAware {

	public Person() {
		System.out.println("person create...");
	}

	//	@Autowired
	ApplicationContext context;  // 可以拿到IOC容器
	MessageSource source;
//
//	public ApplicationContext getContext() {
//		return context;
//	}

	private String name;

	@Autowired
	private Cat cat;

	public String getName() {
		return name;
	}

	//@Lookup
	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// callback机制 把ioc容器传入进来
		this.context = applicationContext;
	}

	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.source = messageSource;
	}

	public ApplicationContext getContext() {
		return context;
	}

	public MessageSource getSource() {
		return source;
	}
}
