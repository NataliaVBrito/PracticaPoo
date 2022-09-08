package entidad;

public class CadenaEntidad {
    //una frase (de tipo de String) y su longitud.
    String frase;
    int longitud;

    public CadenaEntidad() {
    }

    public CadenaEntidad(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }    
    
}
