/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehiculosINVENTAD;
import java.util.Scanner;
/**
 *
 * @author Edgar Jesid Velez Castellanos 20241222443
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        System.out.println("------------COCHE----------");
        
        Coche coche1 = new Coche(4, true, "deportivo", 4, 120,"negro" );
        System.out.println("Su coche tiene " + coche1.getNumPuertas() + " puertas");
        System.out.println( coche1.tipoTransmision());
        System.out.println("Su coche es un " + coche1.getTipo());
        System.out.println("Su coche tiene " + coche1.getNumRuedas() + " ruedas");
        System.out.println("Su coche tiene una velocidad de " + coche1.getVelocidadMaxima() + " km/h");
        System.out.println("Su coche es de color " + coche1.getColor());
        
        
        System.out.println("------------MOTO-------------");
        
        
        Moto moto1= new Moto (true, "deportiva", 2, 250, "Verde");
        System.out.println( moto1.describirVehiculo());
        System.out.println("La moto es " + moto1.getTipo());
        System.out.println("la moto tiene " + moto1.getNumRuedas() + " llantas");
        System.out.println("La moto tiene una velocidad de " + moto1.getVelocidadMaxima() + " km/h");
        System.out.println("La moto es de color " + moto1.getColor());
    }
    
}
