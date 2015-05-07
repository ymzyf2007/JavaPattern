package org.alex.pattern.proxy.statics;

public class Client {

	public static void main(String[] args) {
		IUserManager userManager = new UserManagerImplProxy(new UserManagerImpl());
		userManager.addUser("test", "132");
	}

}