/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EvaEmpresa;

/**
 *
 * @author admin
 */
// Clase ProductoCongelado
public class ProductoCongelado extends Producto {
    private String fechaEnvasado; // Fecha de envasado
    private String paisOrigen; // País de origen
    private double temperaturaMantenimiento; // Temperatura de mantenimiento recomendada

    // Constructor
    public ProductoCongelado(String fechaCaducidad, String numeroLote, String fechaEnvasado,
                             String paisOrigen, double temperaturaMantenimiento) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Producto Congelado:");
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
        System.out.println("Número de lote: " + numeroLote);
        System.out.println("Fecha de envasado: " + fechaEnvasado);
        System.out.println("País de origen: " + paisOrigen);
        System.out.println("Temperatura de mantenimiento: " + temperaturaMantenimiento + "°C");
    }
}

