package org.ruben.java.hilos.hacerUnSingleton.dominio;

public final class SingletonNoSafeThread {
    private static SingletonNoSafeThread instance;
    public String value;

    private SingletonNoSafeThread(String value) {
        this.value = value;
    }

    public static SingletonNoSafeThread getInstance(String value) {
        if (instance == null) {
            instance = new SingletonNoSafeThread(value);
        }
        return instance;
    }

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
    
    
    
}