package org.alex.pattern.proxy.dynamic;

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

}