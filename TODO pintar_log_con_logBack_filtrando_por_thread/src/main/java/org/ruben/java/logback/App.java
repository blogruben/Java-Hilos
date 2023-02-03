package org.ruben.java.logBack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App implements Runnable{
    // assumes the current class is called MyLogger
    private final static Logger logger = LoggerFactory.getLogger(App.class.getName());

    public static void main(String[] args) {
        //Variables en las trazas
        logger.info("inicio");
        String userName = "Ruben";          
        logger.info("Hola {}", userName);
        logger.info("fin");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }
}
