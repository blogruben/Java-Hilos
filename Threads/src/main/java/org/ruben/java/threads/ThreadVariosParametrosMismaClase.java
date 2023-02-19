package org.ruben.java.threads;

import java.time.Duration;
import java.time.Instant;
import org.ruben.java.threads.dominio.PanelControl;
import org.ruben.java.threads.dominio.TareaPesada;


public class ThreadVariosParametrosMismaClase<T,V> implements Runnable {
    private final T t;
    private final V v;

    public ThreadVariosParametrosMismaClase(T t,V v) {
        this.t = t;
        this.v = v;
    }

	public static void main(String[] args) {
		Instant start = Instant.now();
        PanelControl control = new PanelControl("Hola Mundo!! "); 
        ThreadVariosParametrosMismaClase<Instant,PanelControl> tarea1= new ThreadVariosParametrosMismaClase<Instant,PanelControl>(start,control);
        ThreadVariosParametrosMismaClase<Instant,PanelControl> tarea2= new ThreadVariosParametrosMismaClase<Instant,PanelControl>(start,control);
        Thread hilo1= new Thread(tarea1);
        Thread hilo2= new Thread(tarea2);
        hilo1.start();  
        hilo2.start();  
	}

    @Override
    public void run() {
        Instant start = (Instant) t;
        PanelControl control = (PanelControl) v;
        TareaPesada.ejecutar();
        System.out.println(Thread.currentThread().getName()+"  -  "+Duration.between(start, Instant.now())+"  "+control.getNombre());

    }

}
