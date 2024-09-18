/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TRABAJOS;

/**
 *Dada una matriz int[][] matriz = {{8,2,5,4},{9,1,0,8},{9,3,4,1}} escribir por consola cuantos
números pares contiene
 * @author Edgar Jesid velez castellanos 20241222443
 */
public class MatrizMultidimensional_2 {
    public static void main(String[] args) {
        int [][] matriz = {
            {8, 2, 5, 4},
            {9, 1, 0, 8},
            {9, 3, 4, 1}
         };
       int contadorPares=0;    
       for (int i=0; i<matriz.length; i++){
           for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    contadorPares++;
                }
      }
    }
        System.out.println("La cantidad de numeros pares es: " + contadorPares);
}
}