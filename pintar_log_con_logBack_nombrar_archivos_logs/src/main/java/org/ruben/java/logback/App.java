package org.ruben.java.logback;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.util.StatusPrinter;//para debugear logback
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.LoggerContext;


public class App {
  public static void main(String[] args) {
    LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();

    FileAppender fileAppender = new FileAppender();
    fileAppender.setContext(loggerContext);
    fileAppender.setName("tiempoMilisegundos");
    // set the file name
    fileAppender.setFile("./log/" + System.currentTimeMillis()+".log");

    PatternLayoutEncoder encoder = new PatternLayoutEncoder();
    encoder.setContext(loggerContext);
    encoder.setPattern("%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n");
    encoder.start();

    fileAppender.setEncoder(encoder);
    fileAppender.start();

    // anadir el appender al logger
    Logger logbackLogger = loggerContext.getLogger("Main");
    logbackLogger.addAppender(fileAppender);

    //Desmarcar para depurar los logs
    //StatusPrinter.print(loggerContext);

    //Usar log
    logbackLogger.debug("Hola mundo !!");
  }
}