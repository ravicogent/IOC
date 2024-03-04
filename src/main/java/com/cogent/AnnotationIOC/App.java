package com.cogent.AnnotationIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Product product = (Product)context.getBean("product");
		System.out.println(product.getName());
		System.out.println(product.getBrand().getName());

	}
}
