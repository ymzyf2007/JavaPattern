package org.alex.pattern.templatemethod;

public class Client {
	
	public static void main(String[] args) {
		TemplateMethodAbstract obj = new ConcreteImpl2();
		obj.templateMethod("admin2", "123456");
	}

}