package org.alex.pattern.proxy.statics;

public class UserManagerImpl implements IUserManager {

	public void addUser(String username, String password) {
		System.out.println("-------------------addUser()---------------------------");
	}

	public void deleteUser(int id) {
		System.out.println("-------------------deleteUser()---------------------------");
	}

	public void findUserById(int id) {
		System.out.println("-------------------findUserById()---------------------------");
	}

	public void modifyUser(int id) {
		System.out.println("-------------------modifyUser()---------------------------");
	}
	
	/**
	 * 问题提出,在对用户增、删、改、查询的时候都要验证安全性,这样就要在调用每个方法之前先调用检查安全性的方法
	 * （面向切面编程）,为了不改变原来业务层实现类的原有的业务逻辑,故采用静态代理方法
	 */
//	public void checkSecurity() {
//		System.out.println("-------------------checkSecurity()---------------------------");
//	}

}
