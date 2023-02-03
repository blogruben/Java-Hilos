package org.ruben.java.hilos;

import org.ruben.java.hilos.excepciones.MiExcepcion;
import org.ruben.java.hilos.gestionarHilos.Hilos;
import org.ruben.java.hilos.gestionarHilos.Temporizador;


public class App  implements Runnable{

    public static void main(String[] args) {
        Temporizador.iniciarTemporizador(4);
        Hilos.iniciarHilosApp(2);
    }

    /*
     * La logica de los hilos para procesar los ficheros
     */
    @Override
    public void run()
    {
        while(!Temporizador.haTerminado()){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new MiExcepcion("Error al hacer sleep sobre la hebra", e);
            }
        }
    }



}
