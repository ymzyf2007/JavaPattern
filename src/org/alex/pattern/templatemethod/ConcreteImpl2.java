package org.alex.pattern.templatemethod;

public class ConcreteImpl2 extends TemplateMethodAbstract {
	
	@Override
	public boolean validate(String username, String password) {
		if("admin2".equalsIgnoreCase(username) && "123456".equalsIgnoreCase(password)) {
			return true;
		}
		
		return false;
	}

	@Override
	public void display() {
		System.out.println("显示利息2");
	}

	@Override
	public void calculateInterest() {
		System.out.println("按定期利率计算利息！");
	}

}