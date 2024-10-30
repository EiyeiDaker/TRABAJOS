/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeProductos;

/**
 *
 * @author admin
 */
public class ProductoNoPerecedero extends Producto {
    // Constructor
    public ProductoNoPerecedero(String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
    }

    @Override
    public double calcularValorTotal() {
        return super.calcularValorTotal(); // Llama al método de la clase base
    }
}

