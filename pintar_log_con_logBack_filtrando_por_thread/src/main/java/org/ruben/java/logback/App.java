package org.ruben.java.logback;

import org.ruben.java.logback.gestionarHilos.Hilos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App implements Runnable{
    // assumes the current class is called MyLogger
    private final static Logger logger = LoggerFactory.getLogger(App.class.getName());

    public static void main(String[] args) {
        String userName = "Ruben";          
        logger.info("Inicio, hola {}", userName);
        Hilos.iniciarHilosApp(2);
        logger.info("fin");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        logger.info("estoy en un hilo");
        
    }
}
