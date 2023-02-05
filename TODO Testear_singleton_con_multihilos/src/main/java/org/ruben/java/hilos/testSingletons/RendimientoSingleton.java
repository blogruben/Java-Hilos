package org.ruben.java.hilos.testSingletons;

import java.util.concurrent.Callable;

import org.ruben.java.hilos.singletons.Singleton;

public class RendimientoSingleton <T extends Singleton> implements Callable<Void> {
    private int veces;

    public RendimientoSingleton(int testeoVeces) {
        this.veces = testeoVeces;
    }

    @Override
    public Void call() {
        for (int index = 0; index < veces; index++) {
            T.getInstance();
        }
        return null;
    }

 


}