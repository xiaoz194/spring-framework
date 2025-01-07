package com.evan.spring;

import com.evan.spring.bean.Car;
import com.evan.spring.bean.Cat;
import com.evan.spring.bean.Dog;
import com.evan.spring.bean.Person;
import com.evan.spring.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMainTest {
	public static void main(String[] args) {



		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		Person person = applicationContext.getBean(Person.class);
		ApplicationContext context = person.getContext();
		System.out.println(context == applicationContext);




//		System.out.println("==================================");
//
//		// 最上层 ListableBeanFactory
//		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//		for (String name: beanDefinitionNames) {
//			System.out.println(name);
//		}
//
//		Dog dog = (Dog)applicationContext.getBean("bigdog");
//		System.out.println(dog);
//
//		Dog dog1 = (Dog)applicationContext.getBean("dog");
//		System.out.println(dog1);


//		System.out.println("==================================");
//
//		Cat tomcat = (Cat)applicationContext.getBean("tomcat");
//		System.out.println(tomcat);
//
//		Cat cat1 = applicationContext.getBean(Cat.class);
//		Cat cat2 = applicationContext.getBean(Cat.class);
//
//		System.out.println("==================================");
//
//		System.out.println(cat2 == cat1);
//
//		Person person1 = (Person)applicationContext.getBean("person");
//		Person person2 = (Person)applicationContext.getBean("person");
//
//		System.out.println("==================================");
//
//		System.out.println(person2 == person1);
//		System.out.println(person2.getCat() == person1.getCat());


	}
}
