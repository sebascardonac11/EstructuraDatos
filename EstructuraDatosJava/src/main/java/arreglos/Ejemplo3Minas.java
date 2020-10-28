/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author placebo
 */
public class Ejemplo3Minas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int intento = 75;
        BuscaMinas tablero = new BuscaMinas();
        tablero.llenarMinas();
        System.out.println("\n-x----------------------------------------------------x-");
        System.out.println("  Ingresa las coordenas en el rango del 1 al 20");
        do {
            int x = 0, y = 0;

            do {
                System.out.println("\n-x----------------------------------------------------x-");
                System.out.println("\n	Intento :" + intento + " , Cual es su coordenada? \n");
                System.out.print("		Fila:  ");
                x = leer.nextInt();
                System.out.println();
                System.out.print("		Columna:  ");
                y = leer.nextInt();

                if (x == 0 || y == 0 || x > 20 || y > 20) {
                    System.out.println("\n	==>Coordenadas incorrectas<== \n");
                }
            } while (x == 0 || y == 0 || x > 20 || y > 20);

            x = x - 1;
            y = y - 1;
            tablero.buscarMina(x, y);
            intento = intento - 1;
        } while (intento >= tablero.tminas && intento > 0 && tablero.tminas > 0);

        if (tablero.tminas == 0) {
            System.out.println("		GANASTE!");
        }

        if (tablero.tminas > intento) {
            System.out.println("		PERDISTE!    (Exceso de minas restantes " + tablero.tminas + ")\n\n");
        }

        if (intento == 0) {
            System.out.println("		PERDISTE!");
        }
    }

}
