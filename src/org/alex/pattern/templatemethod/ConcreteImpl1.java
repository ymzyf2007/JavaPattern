package org.alex.pattern.templatemethod;

public class ConcreteImpl1 extends TemplateMethodAbstract {

	@Override
	public void calculateInterest() {
		System.out.println("按活期利率计算利息！");
	}

}