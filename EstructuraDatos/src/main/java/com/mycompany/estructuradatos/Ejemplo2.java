package com.mycompany.estructuradatos;

/**
 * Ejemplo de Matrices
 * Curso de Estructura de datos de la universidad IUDigital de Antioquia
 * Desarrollar un programa que permita basado en una matriz de números enteros
 * determinar cúal es el número mayor.
 *
 * @author Sebastian Cardona Correa El ejemplo es tomado del libro: La escencia
 * de la logica de la programación.
 */
public class Ejemplo2 {

    public static void main(String[] args) {
        int[][] Matriz = {
            {10,32,-61,24,19 ,66},
            {25,36,2  ,12,100,1 },
            {15,20,26 ,30,35 ,18},
            {10,21,23 ,26,85 ,17}
        };
        int NMayor = 0;
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                if (NMayor < Matriz[i][j]) {
                    NMayor = Matriz[i][j];
                }
            }
        }
        System.out.println("El numero mayor es: " + NMayor + ".");
    }

}
