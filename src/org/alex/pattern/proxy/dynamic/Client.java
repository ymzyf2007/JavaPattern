package org.alex.pattern.proxy.dynamic;

public class Client {

	public static void main(String[] args) {
		SecurityHandler handler = new SecurityHandler();
		IUserManager userManager = (IUserManager) handler.newProxy(new UserManagerImpl());
		userManager.deleteUser(1);
	}

}