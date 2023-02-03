package org.ruben.java.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class App {
    // assumes the current class is called MyLogger
    private final static Logger logger = LoggerFactory.getLogger(App.class.getName());
            	// Marcadores
	public static Marker importacion = MarkerFactory.getMarker("IMP");
	public static Marker importacionUtils = MarkerFactory.getMarker("UTL");
	public static Marker persistencia = MarkerFactory.getMarker("PER");

    public static void main(String[] args) {




        //Variables en las trazas
        logger.info("inicio");
        String userName = "Ruben";          
        logger.info("Hola {}", userName);
        logger.info("fin");
        logger.info(App.importacion, "Comenzando Ruben");

    }
}
