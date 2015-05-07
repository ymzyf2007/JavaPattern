package org.alex.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityHandler implements InvocationHandler {

	private Object targetObject;
	
	public Object newProxy(Object targetObject) {
		this.targetObject = targetObject;
		return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
									  targetObject.getClass().getInterfaces(),
									  this);
	}
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		checkSecurity();
		Object ret = null;
		try {
			ret = method.invoke(this.targetObject, args);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return ret;
	}

	private void checkSecurity() {
		System.out.println("-------------checkSecurity()-----------------");
	}

}
