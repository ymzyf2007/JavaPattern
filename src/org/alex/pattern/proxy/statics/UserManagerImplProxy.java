package org.alex.pattern.proxy.statics;

public class UserManagerImplProxy implements IUserManager {

	private IUserManager userManager;
	
	public UserManagerImplProxy(IUserManager userManager) {
		this.userManager = userManager;
	}
	
	public void addUser(String username, String password) {
		checkSecurity();
		userManager.addUser(username, password);
	}

	public void deleteUser(int id) {
		checkSecurity();
		userManager.deleteUser(id);
	}

	public void findUserById(int id) {
		checkSecurity();
		userManager.findUserById(id);
	}

	public void modifyUser(int id) {
		checkSecurity();
		userManager.modifyUser(id);
	}
	
	private void checkSecurity() {
		System.out.println("-------------checkSecurity()-----------------");
	}

}