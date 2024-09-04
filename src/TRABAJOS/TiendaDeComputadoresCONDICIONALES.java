/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá  del número de equipos que compre. 
//Si las computadoras son menos de cinco se les dará un  10% de descuento sobre el total de la compra; si el número de computadoras 
//es mayor o igual  a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un  40% de descuento. 
//El precio de cada computadora es de U$500. ..

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
