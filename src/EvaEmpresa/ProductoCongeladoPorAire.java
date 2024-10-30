/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EvaEmpresa;

/**
 *
 * @author admin
 */
// Clase ProductoCongeladoPorAire
public class ProductoCongeladoPorAire extends ProductoCongelado {
    private double porcentajeNitrogeno; // % de nitrógeno
    private double porcentajeOxigeno; // % de oxígeno
    private double porcentajeDioxidoCarbono; // % de dióxido de carbono
    private double porcentajeVaporAgua; // % de vapor de agua

    // Constructor
    public ProductoCongeladoPorAire(String fechaCaducidad, String numeroLote, String fechaEnvasado,
                                     String paisOrigen, double temperaturaMantenimiento,
                                     double porcentajeNitrogeno, double porcentajeOxigeno,
                                     double porcentajeDioxidoCarbono, double porcentajeVaporAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Congelado por aire:");
        System.out.println("Composición del aire:");
        System.out.println("% Nitrógeno: " + porcentajeNitrogeno);
        System.out.println("% Oxígeno: " + porcentajeOxigeno);
        System.out.println("% Dióxido de carbono: " + porcentajeDioxidoCarbono);
        System.out.println("% Vapor de agua: " + porcentajeVaporAgua);
    }
}

