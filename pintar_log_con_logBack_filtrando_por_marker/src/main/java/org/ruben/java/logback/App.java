package org.ruben.java.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class App {
    private final static Logger logger = LoggerFactory.getLogger(App.class.getName());
	public static Marker principal = MarkerFactory.getMarker("principal");
	public static Marker secundario = MarkerFactory.getMarker("secundario");


    public static void main(String[] args) {
        //Variables en las trazas
        logger.info(App.principal, "inicio");
        String userName = "Ruben";          
        logger.info(App.secundario,"Como estas {}?", userName);
        logger.info(App.secundario,"Que tal {}?", userName);
        logger.info(App.principal, "fin");
    }
}
