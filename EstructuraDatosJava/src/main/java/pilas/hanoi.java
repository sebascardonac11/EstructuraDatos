package pilas;


/**
 * Programa que ilustra graficamente el uso de pilas al ir mostrando la soluci�n.
 * El juego consiste en tener en un palo A, n discos de diferente tama�o de mayor a menor y pasarlos 
 * a un palo B usando un disco auxiliar C, con la restricci�n que ning�n
 * disco de tama�o mayor puede colocarse sobre uno menor.
 * @author Amparo L&oacute;pez Gaona
 * @version 1a. ed.
 */
public class hanoi {
    private Pila [] palo;             // Arreglo de palos
    private final int nDiscos;        // Cantidad de discos

    /** 
     * Constructor por omision, crea 3 discos
     */
    public hanoi () { 
	this(3);
    }

    /**
     * Constructor que crea la cantidad de discos especificada
     * @param int -- cantidad de discos a crear
     */
    public hanoi (int n) {
	System.out.println("Torres de Hanoi");
	nDiscos = n;

	palo = new Pila[4];  // Crea los tres postes
	for (int i = 1; i < 4; i++)
	    palo[i] = new Pila();

			// coloca los discos en una pila de mayor a menor
	for (int i = nDiscos; i > 0; i--)
	    palo[1].push(new Integer(i));

	System.out.println("Las torres inicialmente tienen ");
	pinta();

  			//resuelve le problema
	solucion(nDiscos, 1, 2, 3);
    }

    /**
     * Metodo para mostrar el contenido de cada palo
     */
    public void pinta () {
	java.util.Iterator it1 = palo[1].iterador();
	java.util.Iterator it2 = palo[2].iterador();
	java.util.Iterator it3 = palo[3].iterador();

	System.out.println("Palo1 \t\t Palo2 \t\t Palo3");
	for(int i = 0; i < nDiscos; i++) {
	    if (it1.hasNext())
		pintaDisco(((Integer)it1.next()).intValue());
	    else System.out.print("  \t\t");

	    if (it2.hasNext())
		pintaDisco(((Integer)it2.next()).intValue());
	    else System.out.print("  \t\t");

	    if (it3.hasNext())
		pintaDisco(((Integer)it3.next()).intValue());
	    System.out.println();
	}
    }

    /* Metodo auxiliar para mostrar un disco pintando su diametro con estrellas */
    private void pintaDisco(int n){
	for (int i=0; i < n; i++)
	    System.out.print("*");
	System.out.print("\t\t");
    }

    /* Metodo que resuelve el problema */
    private void solucion (int n, int p1, int p2, int p3) {
	if (n > 0) {
	    solucion(n-1, p1, p3, p2);
	    Object disco = palo[p1].pop();
	    palo[p2].push(disco);
	    pinta();
	    solucion(n-1, p3, p2, p1);
	}
    }

    public static void main (String [] pps) {
	if (pps.length != 0) 
	    new hanoi((new Integer(pps[0])).intValue());
	else 
	    new hanoi(); 
    }
}
