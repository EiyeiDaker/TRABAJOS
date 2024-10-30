/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehiculosInventado;

/**
 *
 * @author admin
 */
public class Principal {
    
    public static void main(String[] args) {
        
       Coche coche = new Coche ("Toyota", "Corolla",2020, 20000, 5);
       Motocicleta motocicleta = new Motocicleta ("Harley", "Street", 2015, 15000,true);
       
        System.out.println("Impuesto del coche " + coche.calcularImpuesto());
        System.out.println("Impuesto Motocicleta" + motocicleta.calcularImpuesto();
    }
    
}
