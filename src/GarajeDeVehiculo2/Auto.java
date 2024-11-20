/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GarajeDeVehiculo2;

/**vehiculo = new Auto(matricula, marcaAuto, precioAuto, cilindradaAuto, tieneRadio, tieneNavegador);
 *
 * @author admin
 */
public class Auto extends Vehiculo {
    private boolean tieneRadio;
    private boolean tieneNavegador;

    // Constructor de la clase Auto
    public Auto(String marca, double precio, int cilindrada, boolean tieneRadio, boolean tieneNavegador) {
        super(marca, precio, cilindrada);  // Llamamos al constructor de la clase base (Vehiculo)
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;

        // Ajustar el impuesto de circulación si tiene radio o navegador
        if (tieneRadio) {
            setImpuestoCirculacion(getImpuestoCirculacion() * 1.01);  // Aumento de 1% por tener radio
        }
        if (tieneNavegador) {
            setImpuestoCirculacion(getImpuestoCirculacion() * 1.02);  // Aumento de 2% por tener navegador
        }

        // Si el cilindrada es mayor que 2499, ajustamos la cuota mensual del garaje
        if (cilindrada > 2499) {
            setCuotaMesGaraje(getCuotaMesGaraje() * 1.2);  // Aumento del 20% en la cuota mensual del garaje
        }
    }

    // Métodos getters y setters
    public boolean isTieneRadio() {
        return tieneRadio;
    }

    public void setTieneRadio(boolean tieneRadio) {
        this.tieneRadio = tieneRadio;
    }

    public boolean isTieneNavegador() {
        return tieneNavegador;
    }

    public void setTieneNavegador(boolean tieneNavegador) {
        this.tieneNavegador = tieneNavegador;
    }

    // Override de toString para mostrar información del Auto
    @Override
    public String toString() {
        return "Auto [marca=" + getMarca() + ", precio=" + getPrecio() + ", cilindrada=" + getCilindrada() 
               + ", tieneRadio=" + tieneRadio + ", tieneNavegador=" + tieneNavegador + "]";
    }
}


