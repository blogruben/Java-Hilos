package org.ruben.java.hilos.singletons;

import java.util.Random;

public class Sleep {

    public static void sleepRandom(int max, int min) {
        try {
            int time = new Random().nextInt(max - min + 1) + min;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
