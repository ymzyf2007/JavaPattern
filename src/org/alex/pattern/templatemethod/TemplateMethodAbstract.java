package org.alex.pattern.templatemethod;

public abstract class TemplateMethodAbstract {
	
	// 1、验证用户
	public boolean validate(String username, String password) {
		if("admin".equalsIgnoreCase(username) && "123456".equalsIgnoreCase(password)) {
			return true;
		}
		
		return false;
	}
	
	// 2、计算利息
	public abstract void calculateInterest();
	
	// 3、显示
	public void display() {
		System.out.println("显示利息");
	}
	
	/**
	 * 模板方法
	 * 定义一个算法的骨架
	 * @param username
	 * @param password
	 */
	public void templateMethod(String username, String password) {
		// 1、验证用户
		if(!validate(username, password)) {
			System.out.println("账户或密码错误");
			return;
		}
		
		calculateInterest();
		display();
	}

}