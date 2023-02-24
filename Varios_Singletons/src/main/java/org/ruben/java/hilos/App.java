package org.ruben.java.hilos;

import org.ruben.java.hilos.singletons.SingletonInseguro;

public class App  {

    public static void main(String[] args) {
        //Testear el singleton inseguro, los hilos no acceden a las instancias                       
        SingletonInseguro singleton1 = SingletonInseguro.getInstance();
        SingletonInseguro singleton2 = SingletonInseguro.getInstance();
        String sonIguales = (singleton1 == singleton2) ? " - Ambas instancias son iguales" : " - Las instancias NO son iguales. (ERROR)";                       
        System.out.println(sonIguales);
    }

}
