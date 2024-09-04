/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//ingresar numero y mostrar suma.-
package TRABAJOS;
import java.util.Scanner;
/**
 *
 * @author Edgar Jesid Velez Castellanos 20241222443
 */
public class EntradaSalidaEjercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int num1, num2;
        int resultado;
        System.out.println("Ingrese un numero: ");
        num1= input.nextInt();
        System.out.println("Ingrese otro numero: ");
        num2=input.nextInt();
        resultado= num1 + num2;
        System.out.println(num1+ " mas "+ num2+ " son " + resultado);
       
        
        
        
    }
    
    
}
