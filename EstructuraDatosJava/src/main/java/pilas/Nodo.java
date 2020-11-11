package pilas;

/**
 * Clase para manejar los nodos de la pila
 * @author Amparo Lopez Gaona
 * @version 1a. ed.
 */
public class Nodo { 
    public Object elemento;      // Valor almacenado en el nodo 
    public Nodo sgte;            // Referencia al siguiente elemento 

  /**
   * Metodo para crear un nodo con elemento igual a valor y apuntando al vacio.
   * @param valor --  objeto que es el valor de nodo
   */
  Nodo(Object valor) { 
      this (valor, null);
  }

  /**
   * Metodo para crear un nodo antes del indicado, con elemento igual a valor.
   * @param valor -- objeto que es el valor de nodo
   * @param n --  nodo al que apunta el recien creado
   */
  Nodo(Object valor, Nodo n) {
      elemento = valor;
      sgte = n;
  }

  /**
   * Metodo que devuelve el valor de un nodo
   * @return Object el valor del nodo
   */
  public Object obtenerElemento () { return elemento; }

  /**
   * Metodo que devuelve la referencia del siguiente nodo
   * @return NOdo el siguietne nodo
   */
  public Nodo obtenerSgte() { return sgte;}
}

