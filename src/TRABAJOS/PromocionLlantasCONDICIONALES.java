/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TRABAJOS;
import java.util.Scanner;

// En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste  en lo siguiente: 
//• Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se  compran de cinco a 10 y de U$50 si se compran más de 10. 
//• Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas  que compra y la que tiene que pagar por el total de la compra. 

/**
 *
 * @author aEdgar Jesid Velez Castellanos 20241222443
 */
public class PromocionLlantasCONDICIONALES {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Numllan;
        float total;
        System.out.println("Ingrese la cantidad de llantas compradas: ");
        Numllan= input.nextInt();
        
        if (Numllan<5) {
          total= Numllan*100;
        }
        else { 
            if (Numllan<=10) {
             total=Numllan*75;
             }
            else {
             total=Numllan*50;
             }
        
        }
        System.out.println("EL valor a pagar por cada llanta es de: $" + total/Numllan);
        
        System.out.println("EL valor total de la compra es de: $" + total);
        
        
    }
  
    
    
}
