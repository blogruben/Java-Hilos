package org.ruben.java.hilos.singletons;

public class SingletonInseguro extends Singleton {
    private static SingletonInseguro instance = null;
    public SingletonInseguro() {
      System.out.println("SingletonInseguro");
    }

    public static SingletonInseguro getInstance() {
       if(instance == null) {
          instance = new SingletonInseguro();
       }
       return instance;
    }
 }


 