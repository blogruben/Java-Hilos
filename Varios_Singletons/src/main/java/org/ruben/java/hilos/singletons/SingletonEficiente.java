package org.ruben.java.hilos.singletons;

public class SingletonEficiente {

	private static volatile SingletonEficiente instance;
	private static Object mutex = new Object();

	private SingletonEficiente() {
	}

	public static SingletonEficiente getInstance() {
		SingletonEficiente result = instance;
		if (result == null) {
			synchronized (mutex) {
				result = instance;
				if (result == null)
					instance = result = new SingletonEficiente();
			}
		}
		return result;
	}

}