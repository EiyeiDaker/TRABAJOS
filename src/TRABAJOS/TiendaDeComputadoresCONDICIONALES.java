/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TRABAJOS;
import java.util.Scanner;

/**
 *
 * @author Edgar Jesid Velez Castellanos 20241222443
 */
public class TiendaDeComputadoresCONDICIONALES {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     int Ncom;
     float total, descuento;   
        System.out.println("Ingrese el numero de computadoras a comprar: ");
      Ncom= input.nextInt();
      total= Ncom * 500;
      if (Ncom < 5){
      descuento= (float) (total*.10);
     
      }
      else {
              if ( Ncom < 10){
              descuento = (float) (total*.20);
              }
              else {
              descuento = (float) (total * .40);
              }
      
      }   
      
        System.out.println("El total al pagar son: $"+ (total - descuento));
        System.out.println("El descuento aplicado es: $"+descuento);
    }
   


}
