/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EvaEmpresa;

/**
 *
 * @author admin
 */
// Clase ProductoCongeladoPorNitrogeno
public class ProductoCongeladoPorNitrogeno extends ProductoCongelado {
    private String metodoCongelacion; // Método de congelación
    private int tiempoExposicion; // Tiempo de exposición al nitrógeno en segundos

    // Constructor
    public ProductoCongeladoPorNitrogeno(String fechaCaducidad, String numeroLote, String fechaEnvasado,
                                          String paisOrigen, double temperaturaMantenimiento,
                                          String metodoCongelacion, int tiempoExposicion) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Congelado por nitrógeno:");
        System.out.println("Método de congelación: " + metodoCongelacion);
        System.out.println("Tiempo de exposición: " + tiempoExposicion + " segundos");
    }
}

