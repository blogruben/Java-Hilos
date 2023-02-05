package org.ruben.java.hilos.gestionarHilos;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Hilos {

    public static <T extends Callable<Void>> void crearHilos(Callable<Void> prueba, int numeroHilos)  {
            try {
                ExecutorService servicio= Executors.newFixedThreadPool(numeroHilos);
                servicio.submit(prueba);
                //servicio.shutdown();
                servicio.awaitTermination(5, TimeUnit.MINUTES);
            } catch (InterruptedException e) {
                System.out.println("Error con los hilos");
	        }
    }


    

}

