/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EvaEmpresa;

/**
 *
 * @author admin
 */
// Clase ProductoRefrigerado
public class ProductoRefrigerado extends Producto {
    private String codigoOrganismo; // Código del organismo de supervisión alimentaria
    private String fechaEnvasado; // Fecha de envasado
    private double temperaturaMantenimiento; // Temperatura de mantenimiento recomendada
    private String paisOrigen; // País de origen

    // Constructor
    public ProductoRefrigerado(String fechaCaducidad, String numeroLote, String codigoOrganismo,
                               String fechaEnvasado, double temperaturaMantenimiento, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Producto Refrigerado:");
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
        System.out.println("Número de lote: " + numeroLote);
        System.out.println("Código del organismo: " + codigoOrganismo);
        System.out.println("Fecha de envasado: " + fechaEnvasado);
        System.out.println("Temperatura de mantenimiento: " + temperaturaMantenimiento + "°C");
        System.out.println("País de origen: " + paisOrigen);
    }
}

