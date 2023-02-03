package org.ruben.java.propiedades.leerPropiedades;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.ruben.java.propiedades.excepciones.MiExcepcion;



/*
 * Clase properties, es un singleton (safe-thead) para poder leer los propiedades
 * La primera vez que se le llama carga las propiedades del
 * archivo que se le indique, y luego accedemos a ellas
 * a traves de la funcion getValor()
 */
class AccesoFicheroPropiedades {


    private Properties	_oProperties;
    private String _archivo;

    AccesoFicheroPropiedades(String archivo)  {
        _archivo = archivo;
        //Leemos en properties. 
		try(FileInputStream fileProperties = new FileInputStream(archivo)){
			_oProperties = new Properties( System.getProperties() );
			_oProperties.load( fileProperties );
		}
        catch(IOException exp){
            throw new MiExcepcion("Error al leer el archivo de properties. "+archivo, exp);
        }

    }

    private static ThreadLocal<AccesoFicheroPropiedades> _threadLoca;

    static AccesoFicheroPropiedades getInstance(String archivo)  {
        //crear un singleton protegido contra multihilo
        _threadLoca = ThreadLocal.withInitial(() -> new AccesoFicheroPropiedades(archivo));
        return _threadLoca.get();
    }

	String getValor( String sClave )
	{
        String ValorPropiedad = _oProperties.getProperty( sClave );
        if (ValorPropiedad == null ||ValorPropiedad.equals("")){
            throw new MiExcepcion("Error al leer la propiedad: "+sClave+" del properties: "+_archivo, null);
        }
		return _oProperties.getProperty( sClave );
	}

    
}


