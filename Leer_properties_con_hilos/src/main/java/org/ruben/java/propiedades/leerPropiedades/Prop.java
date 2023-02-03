package org.ruben.java.propiedades.leerPropiedades;

import java.util.Arrays;
import java.util.List;

import org.ruben.java.propiedades.excepciones.MiExcepcion;

/*
 * Este enum se encarga de mapear, los properties del fichero PreexBackEndWSIL
 */
public enum Prop { 
    NUMERO_DE_HILOS("numero_de_hilos"),
    NUMERO_DE_SEGUNDOS("numero_de_segundos"),
    NOMBRE_FICHERO("nombre_fichero"),
    RUTA_FICHERO("ruta_fichero"),
    HACEMOS_UNA_TAREA_SECUNDARIA("hacemos_una_tarea_secundaria"),
    LISTADO_FICHEROS("listado_ficheros");
    
    //ruta relativa del archivo de propiedades
    private static final String ARCHIVO_PROPERTIES = "src/main/resources/Ejemplo.properties";
    private String _clave;
    
    private Prop(String clave) {
        _clave = clave;
    }

    public int getInteger(){
        try{
            return Integer.parseInt( AccesoFicheroPropiedades.getInstance(ARCHIVO_PROPERTIES).getValor(_clave));
        }catch(NumberFormatException e){
            throw new MiExcepcion("Error al iniciar parsear a un integer la clave: "+_clave, e);
        }
    }    

    public Boolean getBoolean(){
        return Boolean.parseBoolean(AccesoFicheroPropiedades.getInstance(ARCHIVO_PROPERTIES).getValor(_clave));
    } 

    public List<String> getListado(){
        return Arrays.asList(AccesoFicheroPropiedades.getInstance(ARCHIVO_PROPERTIES).getValor(_clave).split(","));
    }  

    public String getValue(){
        return AccesoFicheroPropiedades.getInstance(ARCHIVO_PROPERTIES).getValor(_clave);
    }
    public String getkey(){
        return _clave;
    }

    @Override
    public String toString() {
        return getValue();
    }
 
    
	
}