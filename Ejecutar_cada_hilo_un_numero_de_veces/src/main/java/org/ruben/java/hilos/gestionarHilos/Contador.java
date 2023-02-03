package org.ruben.java.hilos.gestionarHilos;

public class Contador {

    private int vecesTotales;
    private int contar;
    private static ThreadLocal<Contador> threadLocal;

    private Contador(int veces) {
        this.vecesTotales = veces;
    }


    public static Contador getInstance(int veces) {
        return ThreadLocal.withInitial(() -> new Contador(veces)).get();
    }

    public int getVeces() {
        return vecesTotales;
    }


    public boolean haTerminado() {
        return contar > vecesTotales;
    }


    public void siguiente() {
        vecesTotales--;
    }

}

