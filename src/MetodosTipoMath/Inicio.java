/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosTipoMath;
import java.util.Scanner;
/**
 *
 * @author admin
 */


public class Inicio {
    public static void main(String[] args) {
        Math2 math2 = new Math2();
        Scanner scanner = new Scanner(System.in);

        // Probar con enteros
        System.out.println("Ingrese la cantidad de enteros:");
        int n = scanner.nextInt();
        int[] enteros = new int[n];
        System.out.println("Ingrese los enteros:");
        for (int i = 0; i < n; i++) {
            enteros[i] = scanner.nextInt();
        }
        System.out.println("Mínimo de enteros: " + math2.min(enteros));
        System.out.println("Máximo de enteros: " + math2.max(enteros));

        // Probar con dobles
        System.out.println("Ingrese la cantidad de decimales:");
        int m = scanner.nextInt();
        double[] decimales = new double[m];
        System.out.println("Ingrese los decimales:");
        for (int i = 0; i < m; i++) {
            decimales[i] = scanner.nextDouble();
        }
        System.out.println("Mínimo de decimales: " + math2.min(decimales));
        System.out.println("Máximo de decimales: " + math2.max(decimales));

        scanner.close(); // Cerrar el scanner
    }
}

