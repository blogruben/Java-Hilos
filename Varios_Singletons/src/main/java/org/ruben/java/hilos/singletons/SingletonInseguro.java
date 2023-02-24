package org.ruben.java.hilos.singletons;

public class SingletonInseguro {
    private static SingletonInseguro instance = null;
    public SingletonInseguro() {
      System.out.println("SingletonInseguro");
    }

    
    public static SingletonInseguro getInstance() {
      //Sleep.sleepRandom(1,1000);

       if(instance == null) {
          instance = new SingletonInseguro();
       }
       return instance;
    }
 }


 