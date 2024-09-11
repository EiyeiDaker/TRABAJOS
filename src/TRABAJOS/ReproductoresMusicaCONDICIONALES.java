/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TRABAJOS;
import java.util.Scanner;

/**Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA,  
 * de algún aparato, si esta cuesta U$500 o más. Además, independientemente de esto, ofrece un  5% de descuento si
 * la marca es “NOSY”. Determinar cuánto pagara,con IVA incluido, un cliente  cualquiera por la compra de su aparato. El IVA es del 19%. 

 *
 * @author Edgar Jesid velez castellanos 20241222443
 */
public class ReproductoresMusicaCONDICIONALES{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float valoraparato;
        float total, IVA, descuento = 0, descuentoagg1;
      
        {System.out.println("Ingrese el valor del aparato comprado: ");
        valoraparato=input.nextInt();
        
         if (valoraparato>=500) {
            descuento= (float) (valoraparato * .10);   
            descuentoagg1 = valoraparato-descuento;
            IVA= (float)(descuentoagg1*.19);
                    
        System.out.println("El valor del aparato con descuento es: " + descuentoagg1);
        System.out.println("El valor del aparato con el IVA incluido es de: " + (descuentoagg1 + IVA));}
        
         
        else {
           if (valoraparato<500) {
               int marca;
               System.out.println("Ingrese el numero de la marca del aparato: ");
               System.out.println("1. NOSY");
               System.out.println("2. Samsung");
                System.out.println("Escriba el numero de la marca del aparato: " );
               marca=input.nextInt();
               
               switch (marca) 
             
               {
                   case 1:
                       float descuentoagg2;
                       
                       System.out.println("La marca que compro es NOSY, obtendra un descuento del 5%!!!");
                       descuento=(float) (valoraparato*.05);
                       descuentoagg2= (valoraparato-descuento);
                       IVA= (float)(descuentoagg2*.19);
                       System.out.println("El valor del aparato con descuento es: " + descuentoagg2);
                       System.out.println("EL valor del aparato con el IVA incluido es de: " + (descuentoagg2+ IVA));
                       break;
                       
                   case 2: 
                       IVA= (float)(valoraparato*.19);
                       System.out.println("La marca seleccionada es Samsung ");
                       System.out.println("EL valor del aparato con el IVA incluido es de: " + (valoraparato+ IVA));
                       break;
                           
               }
              
                     
           }}
            
        }
               
        
        
    
             
        }
    
    
}
