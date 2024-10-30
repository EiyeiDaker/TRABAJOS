/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EvaEmpresa;

/**
 *
 * @author admin
 */
// Clase ProductoCongeladoPorAgua
public class ProductoCongeladoPorAgua extends ProductoCongelado {
    private double salinidad; // Salinidad en gramos de sal por litro de agua

    // Constructor
    public ProductoCongeladoPorAgua(String fechaCaducidad, String numeroLote, String fechaEnvasado,
                                     String paisOrigen, double temperaturaMantenimiento, double salinidad) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.salinidad = salinidad;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Congelado por agua:");
        System.out.println("Salinidad: " + salinidad + " g/L");
    }
}
