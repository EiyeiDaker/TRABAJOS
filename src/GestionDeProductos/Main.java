/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeProductos;

/**
 *
 * @author admin
 */
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ProductoPerecedero leche = new ProductoPerecedero("Leche", 1.5, 10, LocalDate.of(2024, 11, 5));
        ProductoNoPerecedero arroz = new ProductoNoPerecedero("Arroz", 2.0, 20);

        System.out.println("Valor total de " + leche.getNombre() + ": " + leche.calcularValorTotal());
        System.out.println("Valor total de " + arroz.getNombre() + ": " + arroz.calcularValorTotal());
    }
}
