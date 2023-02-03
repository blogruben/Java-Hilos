package org.ruben.java.propiedades.leerPropiedades;

public class ServicioProp {

    /*
     * mostramos por pantalla las propiedades del Enun Prop
     */
    public static void mostrarPropiedadesEnElHilo( )
	{
        System.out.println("-------------------------Propiedades--------------------------");    
        for (Prop prop : Prop.values()) { 
            System.out.println(Thread.currentThread().getName() +" -   "+prop.getkey()+" -> "+prop.getValue()); 
        }
        System.out.println("---------------------------------------------------------------");    
        System.out.println();   
	}
}
