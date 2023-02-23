package org.ruben.java.threads;


public class ThreadSimple implements Runnable {

	public static void main(String[] args) {
    
		
		//los threads no devuelve ni excepciones ni valores y los callables si
		
        ThreadSimple saludar = new ThreadSimple();
        Thread hola = new Thread(saludar);;
        hola.start();
	}

    @Override
    public void run() {
        System.out.println("Hola");
    }

}
