package org.ruben.java.hilos.singletons;

public class Singleton {
    public static Singleton getInstance(){
        throw new Error("Se ha instanciado la clase Singleton. Hay que instanciar sus clases hijas.");
    }
}
