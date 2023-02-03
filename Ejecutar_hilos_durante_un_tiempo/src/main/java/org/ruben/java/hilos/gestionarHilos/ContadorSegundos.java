package org.ruben.java.hilos.gestionarHilos;

import org.ruben.java.hilos.excepciones.MiExcepcion;

public class ContadorSegundos implements Runnable {


    static void iniciarHiloParaContarLosSegundos() {
            Thread th = new Thread(new ContadorSegundos());
            th.start();
    }

    @Override
    public void run() {
        while(!Temporizador.haTerminado()){
            try {
                Thread.sleep( 1000 );
                Temporizador.sumarUnSegundo();
                mostrarProgreso();
            } catch (InterruptedException e) {
                throw new MiExcepcion("Error al dormir un segundo en ContadorSegundos", e);
            }
            
        }
    }

    public static void mostrarProgreso(){
        System.out.println( "[ "+Temporizador.progreso()+"%, Tiempo "+Temporizador.getSegundosTrancuridos()+"s ]\r" );
    }

}
