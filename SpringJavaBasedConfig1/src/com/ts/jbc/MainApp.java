package com.ts.jbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = 
		         new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		   
		      HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		      helloWorld.setMessage("Hello World!");
		      helloWorld.getMessage();

	}

}
