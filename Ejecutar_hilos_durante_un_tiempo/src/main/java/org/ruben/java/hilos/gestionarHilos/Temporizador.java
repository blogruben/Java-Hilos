package org.ruben.java.hilos.gestionarHilos;

public class Temporizador {
    private static volatile int segundosTrancuridos;
    private static int tiempoTotal;

    private Temporizador() {}
    
    public static void iniciarTemporizador(int tiempoTotalEnSegundos){
        segundosTrancuridos = 0;
        tiempoTotal = tiempoTotalEnSegundos;
        ContadorSegundos.iniciarHiloParaContarLosSegundos();
    }

    public static int getSegundosTrancuridos() {
        return segundosTrancuridos;
    }

    static synchronized void sumarUnSegundo() {
        segundosTrancuridos++;
    }

    public static boolean haTerminado(){
        return segundosTrancuridos >= tiempoTotal;
    }

    public static int progreso() {
        float a = (float)segundosTrancuridos/(float)tiempoTotal;
        return (int) (a*100);
    }




}