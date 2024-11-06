/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GarajeDeVehiculos;

/**
 *
 * @author Edgar Jesid Velez Castellanos 20241222443
 */
public class Auto extends Vehiculo {
    private boolean tieneRadio;
    private boolean tieneNavegador;

    public Auto(String marca, double precio, int cilindraje, boolean tieneRadio, boolean tieneNavegador) {
        super(marca, precio, cilindraje);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;
        
        if (tieneRadio) {
            this.setImpuestoCirculacion(this.getImpuestoCirculacion() * 1.01);
        }
        
        if (tieneNavegador) {
            this.setImpuestoCirculacion(this.getImpuestoCirculacion() * 1.02);
        }

        if (cilindraje > 2499) {
            this.setCuotaMesGaraje(this.getCuotaMesGaraje() * 1.2);
        }
    }

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
}




