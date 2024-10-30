/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EvaEmpresa;

/**
 *
 * @author admin
 */
// Clase base Producto
public abstract class Producto {
    protected String fechaCaducidad; // Fecha de caducidad
    protected String numeroLote; // Número de lote

    // Constructor
    public Producto(String fechaCaducidad, String numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    // Métodos de acceso
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    // Método abstracto para mostrar información
    public abstract void mostrarInformacion();
}

