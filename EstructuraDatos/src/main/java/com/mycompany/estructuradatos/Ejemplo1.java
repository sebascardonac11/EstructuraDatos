
package com.mycompany.estructuradatos;

/**
 * Curso de Estructura de datos de la universidad IUDigital de Antioquia
 * Desarrollar un programa que permita basado en un arreglo de números enteros 
 * determinar cúal es el número mayor.
 * @author Sebastian Cardona Correa
 * El ejemplo es tomado del libro: La escencia de la logica de la programación.
 */
public class Ejemplo1 {

    public static void main(String[] args) {
       int[] Vector = {8,6,7,2,1,8,6,8,7,1,12};
       int Pos_May=0;
        for (int i = 0; i < Vector.length; i++) {
            if (Pos_May < Vector[i]) {
                Pos_May = Vector[i];
            }
        }
        System.out.println("El numero mayor es: "+ Pos_May+".");
    }
    
}
