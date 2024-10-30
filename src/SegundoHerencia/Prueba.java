/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundoHerencia;

/**
 *
 * @author admin
 */
public class Prueba {
    
    public static void main(String[] args) {
        
       
        Empleado c1 = new Empleado("Edgar Jesid", "12345", 30, true, 3000);
        System.out.println(c1.toString());
        System.out.println("Clasificacion: " + c1.clasifica());
        
        
        c1.subirSalario(10);
        System.out.println("Salario despues de aumento" + c1.getSalario());
        
        Programador programador1 = new Programador("Luis fernando", "24242424", 25, false, 3500, 200, "Java");
        System.out.println("\n" + programador1.toString());
        System.out.println("Clasificacion: " + programador1.clasifica());
        System.out.println("Salario calculado: " + programador1.calculaSalario());
    }
    
}
