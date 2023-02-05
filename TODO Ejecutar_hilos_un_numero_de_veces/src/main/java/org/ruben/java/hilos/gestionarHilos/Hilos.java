package org.ruben.java.hilos.gestionarHilos;

import java.util.ArrayList;
import java.util.List;
import org.ruben.java.hilos.App;

public class Hilos {

    private static void crearHilos(int numeroHilos)  {
            App t = new App();
            List<Thread> hilos = new ArrayList<>();
            //creamos los hilos
            for ( int i = 0; i < numeroHilos; i++ )
		    {
                hilos.add(new Thread(t));
            }
            //Iniciamos los hilos
            for (Thread th : hilos) {
                th.start();
            }
            //Continuamos con la ejecucion principal
            //una vez que hagan terminado
            for (Thread th : hilos) {
                try {
                    th.join();
                } catch (InterruptedException e) {
                    System.out.println("Error al iniciar los hilos de ejecucion para procesar los ficheros");
                }
            }
	}



    

}

