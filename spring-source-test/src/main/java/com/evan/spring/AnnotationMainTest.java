package com.evan.spring;

import com.evan.spring.bean.Cat;
import com.evan.spring.bean.Person;
import com.evan.spring.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMainTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
//		Person person = applicationContext.getBean(Person.class);
//		System.out.println(person);
//		System.out.println("name: " + person.getName());
//
//		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//		for (String name: beanDefinitionNames) {
//			System.out.println(name);
//		}

//		Cat tomcat = (Cat)applicationContext.getBean("tomcat");
//		System.out.println(tomcat);

		Cat cat1 = applicationContext.getBean(Cat.class);
		Cat cat2 = applicationContext.getBean(Cat.class);
		System.out.println(cat2 == cat1);

		Person person1 = (Person)applicationContext.getBean("person");
		Person person2 = (Person)applicationContext.getBean("person");
		System.out.println(person2 == person1);
		System.out.println(person2.getCat() == person1.getCat());


	}
}
