/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multiviviendas;

/**
 *
 * @author admin
 */
public class Piso extends Vivienda {
    private int planta;
    private int puerta;

    // Constructor
    public Piso(String calle, int superficieEnMetros, int planta, int puerta) {
        super(calle, superficieEnMetros);
        this.planta = planta;
        this.puerta = puerta;
    }

    @Override
    public String toString() {
        return super.toString() + ", Planta: " + planta + ", Puerta: " + puerta;
    }
}
