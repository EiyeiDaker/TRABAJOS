/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TRABAJOS;

/**
 *Dada una matriz int[][] matriz = {{8,2,5,4},{9,1,0,8},{9,3,4,1}} escribir sus valores por consola
 * @author EDGAR JESID VELEZ CASTELLANOS 20241222443
 */
public class MatrizMultidimensionalARRAYS {
    public static void main(String[] args) {
        int[][] matriz = {
            {8, 2, 5, 4},
            {9, 1, 0, 8},
            {9, 3, 4, 1}
        };

        // Recorrer la matriz y imprimir sus valores
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Nueva línea al final de cada fila
        }
    }
}


