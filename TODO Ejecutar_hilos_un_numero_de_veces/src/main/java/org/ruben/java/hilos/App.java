package org.ruben.java.hilos;

import org.ruben.java.hilos.gestionarHilos.Hilos;


public class App  implements Runnable{

    public static void main(String[] args) {
        Hilos.iniciarHilosApp(2);
        //Consola.mostrarResultadoFinal();
    }

    /*
     * La logica de los hilos para procesar los ficheros
     */
    @Override
    public void run()
    {
        //while(!Comtador.haTerminado()){

        //}
    }






}
