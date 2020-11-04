package colas;


/**
 * Curso de Estructura de datos de la universidad IUDigital de Antioquia
 * @author Sebastian Cardona Correa
 */
public class Nodo {
    private int elemento;
    private Nodo siguiente;

    public Nodo(int elem, Nodo sig) {
        this.elemento = elem;
        this.siguiente = sig;
    }
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public Nodo(){
        this.elemento = 0;
        this.siguiente = null;
    }
    public int getElemento() {      return this.elemento;   }
    public Nodo getSig() {  return this.siguiente;  }
    public void setElemento(int elem) { this.elemento = elem;    }
    public void setSig(Nodo sig) {  this.siguiente = sig;    }
}
