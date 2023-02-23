package org.ruben.java.threads.dominio;

import java.time.Duration;
import java.time.Instant;

public class ThreadParametros<T> implements Runnable{

		  private final T t;

		  public ThreadParametros(T t) {
		    this.t = t;
		  }

	    @Override
	    public void run() {
	         
	    	Instant start = (Instant) t;
	    	TareaPesada.ejecutar();
	        System.out.println(Thread.currentThread().getName()+"  -  "+Duration.between(start, Instant.now()));
	    }
	
	    
	    
	}


