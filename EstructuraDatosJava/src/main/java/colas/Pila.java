package colas;
/**
 * Curso de Estructura de datos de la universidad IUDigital de Antioquia
 * @author Sebastian Cardona Correa
 */
public class Pila {
    // Puntero que indica el inicio de la pila o tambein conocida como el
    // tope de la pila.
    private Nodo inicio;
    // Variable para registrar el tamaño de la pila.
    private int tamanio;
    /**
     * Constructor por defecto.
     */
    public void Pila(){
        inicio = null;
        tamanio = 0;
    }
    /**
     * Consulta si la pila esta vacia.
     * @return true si el primer nodo (inicio), no apunta a otro nodo.
     */
    public boolean esVacia(){
        return inicio == null;
    }
    /**
     * Consulta cuantos elementos (nodos) tiene la pila.
     * @return numero entero entre [0,n] donde n es el numero de elementos
     * que contenga la lista.
     */
    public int getTamanio(){
        return tamanio;
    }
    /**
     * Agrega un nuevo nodo a la pila.
     * @param valor a agregar.
     */
    public void apilar(int valor){
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        // Agrega al valor al nodo.
        nuevo.setElemento(valor);
        // Consulta si la pila esta vacia.
        if (esVacia()) {
            // Inicializa la pila con el nuevo valor.
            inicio = nuevo;
        }
        // Caso contrario agrega el nuevo nodo al inicio de la pila.
        else{
            nuevo.setSig(inicio);
            inicio = nuevo;
        }
        // Incrementa el contador del tamaño.
        tamanio++;
    } 
    /**
     * Elimina el elemento que se encuentra en el tope de la piala.
     */
    public void retirar(){
        if (!esVacia()) {
            // Asigna como primer nodo al siguiente de la pila.
            inicio = inicio.getSig();
            // Decrementa el contador del tamaño de la pila
            tamanio--;
        }
    }
    /**
     * Consulta el valor del nodo que se encuentra en la cima de la pila
     * @return valor del nodo.
     * @throws Exception 
     */
    public int cima() throws Exception{
        if(!esVacia()){
            return inicio.getElemento();
        } else {
            throw new Exception("La pila se encuentra vacia.");
        }
    }
    /**
     * Busca un elemento en la pila.
     * @param referencia valor del nodo a buscar.
     * @return true si el valor de referencia existe en la pila.
     */
    public boolean buscar(int referencia){
        // Crea una copia de la pila.
        Nodo aux = inicio;
        // Bandera para verificar si existe el elemento a buscar.
        boolean existe = false;
        // Recorre la pila hasta llegar encontrar el nodo o llegar al final
        // de la pila.
        while(existe != true && aux != null){
            // Compara si el valor del nodo es igual que al de referencia.
            if (referencia == aux.getElemento()) {
                // Cambia el valor de la bandera.
                existe = true;
            }
            else{
                // Avanza al siguiente nodo.
                aux = aux.getSig();
            }
        }
        // Retorna el valor de la bandera.
        return existe;
    }
    /**
     * Elimina un nodo de la pila ubicado por su valor.
     * @param referencia valor de referencia para ubicar el nodo.
     */  
    public void remover(int referencia){
        // Consulta si el valor existe en la pila.
        if (buscar(referencia)) {
            // Crea una pila auxiliar para guardar los valores que se 
            // vayan desapilando de la pila original.
            Nodo pilaAux = null;
            // Recoore la pila hasta llegar al nodo que tenga el valor
            // igual que el de referencia.
            while(referencia != inicio.getElemento()){
                // Crea un nodo temporal para agregarlos a la pila auxiliar.
                Nodo temp = new Nodo();
                // Ingresa el valor al nodo temporal.
                temp.setElemento(inicio.getElemento());
                // Consulta si la pila auxiliar no a sido inicializada.
                if(pilaAux == null){
                    // Inicializa la pila auxiliar.
                    pilaAux = temp;
                }
                // Caso contrario si la pila auxiliar ya contiene elementos
                // los agrega al inicio.
                else{
                    temp.setSig(pilaAux);
                    pilaAux = temp;
                }
                // Elimina el nodo del tope de la pila hasta llegar al nodo
                // que se desea eliminar.
                retirar();
            }
            // Elimina el nodo que coincide con el de referencia.
            retirar();
            // Regresa los valores de la pila auxiliar a la pila original
            // mientras la pila auxiliar tenga elementos.
            while(pilaAux != null){
                // Utiliza el metodo apilar para regresar los elementos a 
                // la pila original.
                apilar(pilaAux.getElemento());
                // Avansa al siguiente nodo de la pila auxiliar.
                pilaAux = pilaAux.getSig();
            }
            // Libera la memoria utilizada por la pila auxiliar.
            pilaAux = null;
        }
    }    
    /**
     * Actualiza el valor de un nodo en la pila.
     * @param referencia valor del nodo para ubicar el que se desea actualizar.
     * @param valor por el cual se desea remplazar el valor del nodo.
     */
    public void editar(int referencia, int valor){
        // Consulta si el nodo existe en la pila
        if (buscar(referencia)) {
            // Crea una pila auxiliar.
            Nodo pilaAux = null;
            // Recoore la pila hasta llegar al nodo que tenga el valor
            // igual que el de referencia.
            while(referencia != inicio.getElemento()){
                // Crea un nodo temporal para agregarlos a la pila auxiliar.
                Nodo temp = new Nodo();
                // Ingresa el valor al nodo temporal.
                temp.setElemento(inicio.getElemento());
                // Consulta si la pila auxiliar no a sido inicializada.
                if(pilaAux == null){
                    // Inicializa la pila auxiliar.
                    pilaAux = temp;
                }
                // Caso contrario si la pila auxiliar ya contiene elementos
                // los agrega al inicio.
                else{
                    temp.setSig(pilaAux);
                    pilaAux = temp;
                }
                // Elimina el nodo del tope de la pila hasta llegar al nodo
                // que se desea eliminar.
                retirar();
            }
            // Actualiza el valor del nodo.
            inicio.setElemento(valor);
            // Regresa los valores de la pila auxiliar a la pila original
            // mientras la pila auxiliar tenga elementos.
            while(pilaAux != null){
                // Utiliza el metodo apilar para regresar los elementos a 
                // la pila original.
                apilar(pilaAux.getElemento());
                // Avansa al siguiente nodo de la pila auxiliar.
                pilaAux = pilaAux.getSig();
            }
            // Libera la memoria utilizada por la pila auxiliar.
            pilaAux = null;
        }
    }
    /**
     * Elimina la pila
     */
    public void eliminar(){
        // Elimina el valor y la referencia a los demas nodos.
        inicio = null;
        // Reinicia el contador a 0.
        tamanio = 0;
    }
    /**
     * Despliega en pantalla los elementos de la pìla.
     */
    public void listar(){
        // Crea una copia de la pila.
        Nodo aux = inicio;
        // Recorre la pila hasta el ultimo nodo.
        while(aux != null){
            System.out.println("|\t" + aux.getElemento() + "\t|");
            System.out.println("-----------------");
            aux = aux.getSig();
        }
    }
}