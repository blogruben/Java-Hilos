package org.ruben.java.hilos;

import org.ruben.java.hilos.gestionarHilos.Contador;
import org.ruben.java.hilos.gestionarHilos.Hilos;

public class App  implements Runnable{

    public static void main(String[] args) {
        Hilos.iniciarHilosApp(3);

    }

    @Override
    public void run()
    {
        Contador contador = Contador.getInstance(3);
        while(!contador.haTerminado()){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println("Error al parar la ejecucion");
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName()+" - veces: "+contador.getVeces());
            contador.siguiente();
        }
    }






}
