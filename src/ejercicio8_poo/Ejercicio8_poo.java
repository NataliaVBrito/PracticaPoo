package ejercicio8_poo;

import entidad.CadenaEntidad;
import servicio.CadenaServicio;

public class Ejercicio8_poo {

    public static void main(String[] args) {
        CadenaServicio cadenaServicio = new CadenaServicio();
        CadenaEntidad cadenaEntidad = cadenaServicio.crearFrase();
        
//        cadenaServicio.cantVocales(cadenaEntidad);
//        cadenaServicio.invertirFrase(cadenaEntidad);
          cadenaServicio.vecesRepetido(cadenaEntidad);
//        cadenaServicio.compararLongitud(cadenaEntidad);
//        cadenaServicio.unirFrase(cadenaEntidad);
//        cadenaServicio.reemplazar(cadenaEntidad);
//        cadenaServicio.contiene(cadenaEntidad);
    }

}
