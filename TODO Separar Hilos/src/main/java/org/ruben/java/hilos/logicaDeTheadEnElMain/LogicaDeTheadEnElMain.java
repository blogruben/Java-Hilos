package org.ruben.java.hilos.logicaDeTheadEnElMain;

    class LogicaDeTheadEnElMain implements Runnable {
        public void run()
        {
            System.out.println("Thead");
        }
        public static void main(String[] args)
        {
            LogicaDeTheadEnElMain t = new LogicaDeTheadEnElMain();
            Thread t1 = new Thread(t);
            t1.start();
            System.out.println("Main method executed by main thread");
        }
    }