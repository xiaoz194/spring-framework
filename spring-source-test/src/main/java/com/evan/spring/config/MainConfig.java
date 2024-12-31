package com.evan.spring.config;

import com.evan.spring.bean.Cat;
import com.evan.spring.bean.Dog;
import com.evan.spring.bean.Person;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotationMetadata;

@Configuration
@ComponentScan(basePackages = "com.evan.spring")
@Import({MainConfig.MyImportRegister.class})
public class MainConfig {

//	@Bean
//	public Person person() {
//		Person person = new Person();
//		person.setName("sora");
//		return person;
//	}

	static class MyImportRegister implements ImportBeanDefinitionRegistrar {
		@Override
		public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
			// 设置bean的定义信息
			RootBeanDefinition dogBeanDefinition = new RootBeanDefinition();
			dogBeanDefinition.setBeanClass(Dog.class);
			registry.registerBeanDefinition("bigdog",dogBeanDefinition);
		}
	}


}


