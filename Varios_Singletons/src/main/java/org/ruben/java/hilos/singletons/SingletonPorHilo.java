package org.ruben.java.hilos.singletons;

public class SingletonPorHilo {

    private SingletonPorHilo() {
    }

    public static SingletonPorHilo getInstance(int veces) {
        return ThreadLocal.withInitial(() -> new SingletonPorHilo()).get();
    }



}
