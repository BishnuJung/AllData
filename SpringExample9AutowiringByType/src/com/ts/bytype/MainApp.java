package com.ts.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext conn=new ClassPathXmlApplicationContext("a.xml");
		TextEditior te=(TextEditior) conn.getBean("b");
		te.spellCheck();

	}

}
