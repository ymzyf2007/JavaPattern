package org.alex.pattern.proxy.dynamic;

public interface IUserManager {
	
	void addUser(String username, String password);
	
	void deleteUser(int id);
	
	void modifyUser(int id);
	
	void findUserById(int id);
}