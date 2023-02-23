package org.ruben.java.threads.dominio;



public class TareaPesada {
	 
	    public static void ejecutar() {
	        for(int i=0;i<5;i++) {
	             try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	        }
	    }
	}


