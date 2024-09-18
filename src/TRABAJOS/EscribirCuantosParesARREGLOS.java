/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TRABAJOS;

/**
 *Dado un array int[] vectorDeDatos = {8,2,5,4,9,1,0,8,9,3} escribir por consola cuantos pares
contiene
 * @author edgar jesid velez castellanos 20241222443
 */
public class EscribirCuantosParesARREGLOS {
      public static void main(String[] args) {
      
      int[] vectorDeDatos = {8,2,5,4,9,1,0,8,9,3};
      int contadorPares=0;
      
      for (int i=0; i<vectorDeDatos.length; i++){
          if (vectorDeDatos[i] % 2 == 0){
          contadorPares++;
          }
      }
      
          System.out.println("La cantidad de numeros pares ingresados es: " + contadorPares);
      }
     
}
  
