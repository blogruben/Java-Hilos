package org.ruben.java.hilos.excepciones;

/*
 * Creamos un excepcion unchecked o de runtime, para todo el programa.
 * Usando excepciones de runtime desacoplamos el codigo, manteniendo las trazas
 * Esta excepcion no se trata, y la aplicacion para. 
 */
public class MiExcepcion extends Error {
    public MiExcepcion(String descripcionDelError,Throwable t) {
        super(descripcionDelError, t);
    }
}
