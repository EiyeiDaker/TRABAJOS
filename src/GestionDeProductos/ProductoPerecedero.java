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

public class ProductoPerecedero extends Producto {
    private LocalDate fechaCaducidad;

    // Constructor
    public ProductoPerecedero(String nombre, double precio, int cantidad, LocalDate fechaCaducidad) {
        super(nombre, precio, cantidad);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public double calcularValorTotal() {
        double valorTotal = super.calcularValorTotal();
        if (fechaCaducidad.isBefore(LocalDate.now().plusDays(5))) {
            valorTotal *= 0.90; // Aplica un 10% de descuento
        }
        return valorTotal;
    }

    // Getter
    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }
}
