package org.ruben.java.threads;

import java.time.Duration;
import java.time.Instant;

import org.ruben.java.threads.dominio.TareaPesada;


public class ThreadUnParametroMismaClase<T> implements Runnable {
    private final T t;

    public ThreadUnParametroMismaClase(T t) {
        this.t = t;
      }

	public static void main(String[] args) {
		Instant start = Instant.now();
        ThreadUnParametroMismaClase<Instant> tarea1= new ThreadUnParametroMismaClase<Instant>(start);
        ThreadUnParametroMismaClase<Instant> tarea2= new ThreadUnParametroMismaClase<Instant>(start);
        Thread hilo1= new Thread(tarea1);
        Thread hilo2= new Thread(tarea2);
        hilo1.start();  
        hilo2.start();  
	}

    @Override
    public void run() {
        Instant start = (Instant) t;
        TareaPesada.ejecutar();
        System.out.println(Thread.currentThread().getName()+"  -  "+Duration.between(start, Instant.now()));

    }

}
