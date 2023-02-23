package org.ruben.java.threads;

import java.time.Instant;
import org.ruben.java.threads.dominio.ThreadParametros;

public class ThreadConParametros {

	public static void main(String[] args) {
    
		Instant start = Instant.now();
        ThreadParametros<Instant> tarea1= new ThreadParametros<Instant>(start);
        ThreadParametros<Instant> tarea2= new ThreadParametros<Instant>(start);
        Thread hilo1= new Thread(tarea1);
        Thread hilo2= new Thread(tarea2);
        hilo1.start();  
        hilo2.start();  
	}
}
