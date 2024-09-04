/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Una empresa automotriz necesita un sistema para seleccionar el tipo de carro (auto, SUV o  camioneta) lo cual debe de aparecer en un menú,
//y el color (negro, blanco o rojo) en otro menú.  Al final se necesita que despliegue la selección realizada. Nota. Debe de anidarse una estructura 
//de selección múltiple dentro de otra. 

package TRABAJOS;
import java.util.Scanner;

/**
 *
 * @author Edgar Jesid Velez Castellanos 20241222443
 */
public class EmpresaAutomotrizSWITCH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int carro;
        System.out.println("MENU CARROS");
        System.out.println("1. Auto");
        System.out.println("2. SUV");
        System.out.println("3. Camioneta");
        System.out.println("Escriba la opcion deseada: ");
        carro=input.nextInt();
        
        int color;
        
        System.out.println("MENU COLORES");
        System.out.println("1. Negro");
        System.out.println("2. Blanco");
        System.out.println("3. Rojo");
        System.out.println("Escriba la opcion deseada: ");
        color=input.nextInt();
        
        switch (carro){
            
            case 1:
                System.out.println("El tipo de carro seleccionado es: Auto");
                switch (color){
                    case 1 -> System.out.println("Color seleccionado: Negro");
                    case 2 -> System.out.println("Color seleccionado: Blanco");
                    case 3 -> System.out.println("Color seleccionado: Rojo");
                    
                }
                break;

            case 2: 
                System.out.println("El tipo de carro seleccionado es: SUV");
                switch (color){
                    case 1 -> System.out.println("Color seleccionado: Negro");
                    case 2 -> System.out.println("Color seleccionado: Blanco");
                    case 3 -> System.out.println("Color seleccionado: Rojo");
                }
                break;
            case 3: 
                System.out.println("EL tipo de carro seleccionado es: Camioneta");
                switch (color){
                    case 1 -> System.out.println("Color seleccionado: Negro");
                    case 2 -> System.out.println("Color seleccionado: Blanco");
                    case 3 -> System.out.println("Color seleccionado: Rojo");
                }
                break;
                
                
        }
        
    }
    
}
                
                
              
        
        
        

                
        
        
        
    
   
