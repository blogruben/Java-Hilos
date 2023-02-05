package org.ruben.java.hilos.testSingletons;
 
import java.util.Random;
import java.util.concurrent.Callable;

import org.ruben.java.hilos.singletons.Singleton;
 
public class TestSingleton <T extends Singleton> implements Callable<Void>  {

    @Override
    public Void call()  {
        Singleton instance1 = T.getInstance();
        sleepRandom(100, 50);
        Singleton instance2 = T.getInstance();
        String sonIguales = (instance1 == instance2) ? " - Ambas instancias son iguales" : " - Las instancias NO son iguales. (ERROR)";
        System.out.println(getThreadName() + sonIguales);
        return null;
    }

    private void sleepRandom(int max, int min) {
        try {
            int time = new Random().nextInt(max - min + 1) + min;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    private String getThreadName() {
        return "[" + Thread.currentThread().getName() + "] - ";
    }

    
}