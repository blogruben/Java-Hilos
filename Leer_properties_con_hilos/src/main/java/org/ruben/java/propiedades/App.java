package org.ruben.java.propiedades;


import java.util.List;

import org.ruben.java.propiedades.leerPropiedades.Prop;
import org.ruben.java.propiedades.leerPropiedades.ServicioProp;

public class App  implements Runnable{

    public static void main(String[] args) {

        //mostramos la configuracion de la app
        ServicioProp.mostrarPropiedadesEnElHilo();
        
        //La propiedades devuelte el tipo de dato esperado
        int numero = Prop.NUMERO_DE_HILOS.getInteger();
        String clave = Prop.NOMBRE_FICHERO.getkey();
        String valor = Prop.NOMBRE_FICHERO.getValue();
        //Sobreescribimos el toString del Enum 
        //para devolver el valor directamente sin hager .getValue()
        System.out.println("El valor es "+Prop.NOMBRE_FICHERO);
        //Leemos un listado
        List<String> listado = Prop.LISTADO_FICHEROS.getListado();
        //Boolean
        Boolean hacerTarea = Prop.HACEMOS_UNA_TAREA_SECUNDARIA.getBoolean();

        //Iniciar Hilos
        App t = new App();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        t2.start();

    }

    /*
     * La logica de los hilos para procesar los ficheros
     */
    @Override
    public void run()
    {
        //mostramos la configuracion de la app en hilos
        ServicioProp.mostrarPropiedadesEnElHilo();
    }






}
