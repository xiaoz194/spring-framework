package com.evan.spring;

import com.evan.spring.bean.Car;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMainTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Car bean = context.getBean(Car.class);
		System.out.println(bean);
	}
}
