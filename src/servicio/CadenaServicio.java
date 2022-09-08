package servicio;

import entidad.CadenaEntidad;
import java.util.Scanner;

public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /*
    Se pide al usuario ingresar lo que desee(palabras, espacios en blanco)
    Se mide la longitud de lo ingresado de forma automática
    Se inicializa el objeto CadenaEntidad
    */
    public CadenaEntidad crearFrase() {
        System.out.println("Ingrese lo que quiera");
        String frase = leer.next();

        int longitud = frase.length();        
        System.out.println("Ingresaste " + longitud + " caracteres");

        return new CadenaEntidad(frase, longitud);
    }

    /*
    Se contabiliza e imprime la cantidad de vocales que tiene lo ingresado por el usuario
    */
    public void cantVocales(CadenaEntidad cadena) {
        int vocales = 0;
        String frase = cadena.getFrase();

        for (int i = 0; i < frase.length(); i++) {
            if ((frase.charAt(i) == 'a') || (frase.charAt(i) == 'e') || (frase.charAt(i) == 'i')
                    || (frase.charAt(i) == 'o') || (frase.charAt(i) == 'u')) {
                vocales++;
            }
        }

        System.out.println("La frase ingresada contiene " + vocales + " vocales");
    }

    /*
    Se imprime lo ingresado por el usuario de forma invertida
    Ejemplo: 
                Entrada: "casa blanca"
                Salida: "acnalb asac".
    */
    public void invertirFrase(CadenaEntidad cadena) {
        String frase = cadena.getFrase();
        String fraseInvertida = "";

        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida = fraseInvertida + frase.charAt(i);
        }
        
        System.out.println("La frase invertida queda de la siguiente manera:");
        System.out.println(fraseInvertida);
    }

    /*
    Se pide al usuario una letra que quiera contabilizar
    El sistema la busca, la cuenta e imprime la cantidad de veces que se repite
    */
    public void vecesRepetido(CadenaEntidad cadena) {
        System.out.println("¿Qué letra quieres contabilizar?");
        String letra = leer.next();
        
        char caracter = letra.charAt(0);
        int contador = 0;

        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().charAt(i) == caracter) {
                contador++;
            }
        }

        System.out.println("La letra '" + caracter + "' se encuentra " + contador + " veces en la frase");
    }

    /*
    Se pide al usuario una segunda frase para comparar su longitud con la primera
    Se contabilizan ambas frases, se imprimen las longitudes y la cantidad de caracteres de diferencia
    */
    public void compararLongitud(CadenaEntidad cadena) {
        System.out.println("Ingrese la frase a comparar");
        String frase2 = leer.next();

        int longFrase2 = frase2.length();

        System.out.println("La primera frase contiene " + cadena.getLongitud() + " caracteres");
        System.out.println("La segunda frase contiene " + longFrase2 + " caracteres");

        int diferencia = cadena.getLongitud() - longFrase2;
        System.out.println("Hay una diferencia de " + diferencia + " caracteres");
    }

    /*
    Se pide al usuario una palabra o frase que quiera unir a la primera frase
    Se realiza la unión y se imprime por pantalla
    */
    public void unirFrase(CadenaEntidad cadena) {
        System.out.println("Esta es tu frase principal");
        System.out.println("'" + cadena.getFrase() + "'");

        System.out.println("Ingrese la palabra o frase a unir con la principal");
        String frase = leer.next();

        cadena.setFrase(cadena.getFrase() + " " + frase);
        System.out.println("Ahora tu frase queda así");
        System.out.println(cadena.getFrase());
    }

    /*
    Se pide al usuario un caracter por el que quiera sustituir la letra 'A'
    Se sustituye la letra 'A' y se imprime la frase nueva
    */
    public void reemplazar(CadenaEntidad cadena) {
        System.out.println("¿Por cuál caracter quieres sustituir la letra A?");
        String caracter = leer.next();

        String frase = cadena.getFrase();
        String fraseNueva = "";

        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (frase.charAt(i) == 'a') {
                fraseNueva = fraseNueva + caracter;
            } else {
                fraseNueva = fraseNueva + frase.charAt(i);
            }
        }

        System.out.println("Tu frase quedó así:");
        System.out.println(fraseNueva);
    }

    /*
    Se pregunta al usuario por una letra para saber si existe en lo ingresado al principio
    Se imprime si existe o no el caracter
    */
    public void contiene(CadenaEntidad cadena) {
        System.out.println("¿Qué letra quieres saber si existe?");
        String caracter = leer.next();

        if (cadena.getFrase().contains(caracter)) {
            System.out.println("La letra " + caracter + " si existe en esta frase");
        } else {
            System.out.println("La letra " + caracter + " no existe en esta frase");
        }
    }
}
