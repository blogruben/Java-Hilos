package org.ruben.java.hilos.singletons;

public class SingletonIneficiente {
    private static SingletonIneficiente singleton;

    public SingletonIneficiente() {
      System.out.println("SingletonIneficiente");
    }

    public static synchronized SingletonIneficiente getInstance() {
        if (singleton == null) {
            singleton = new SingletonIneficiente();
        }
        return singleton;
    }
 }


 