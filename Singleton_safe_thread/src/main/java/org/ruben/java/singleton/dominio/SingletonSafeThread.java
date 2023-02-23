package org.ruben.java.hilos.hacerUnSingleton.dominio;

public class SingletonSafeThread {
	
	//singleton con sincronization para asegurar que solo
	//una instancias es creada cuando hay varios hilos

    private static SingletonSafeThread INSTANCE = null;

    private SingletonSafeThread() {}

    public static SingletonSafeThread getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonNoSafeThread.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonSafeThread();
                }
            }
        }
        return INSTANCE;
    }

}