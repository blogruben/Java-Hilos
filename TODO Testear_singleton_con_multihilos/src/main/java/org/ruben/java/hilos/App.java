package org.ruben.java.hilos;

import java.util.concurrent.Callable;

import org.ruben.java.hilos.gestionarHilos.Hilos;
import org.ruben.java.hilos.singletons.SingletonInseguro;
import org.ruben.java.hilos.testSingletons.TestSingleton;

public class App  {

    public static void main(String[] args) {
        
        //Testear el singleton inseguro, los hilos no acceden a las instancias
        Callable<Void> prueba1 = new TestSingleton<SingletonInseguro>();
        Hilos.crearHilos(prueba1, 3);
       
        //Comparar tiempos de singleton ineficiente y eficiente
        //Prueba pruebaEficiente = new RendimientoSingleton<SingletonEficiente>(3);
        //Prueba pruebaIneficiente = new RendimientoSingleton<SingletonIneficiente>(3);
        //Hilos.crearHilos(pruebaEficiente, 6);
        //Hilos.crearHilos(pruebaIneficiente, 6);
    }

}
