/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multiviviendas;

/**
 *
 * @author admin
 */
public class Adosado extends Vivienda {
    private int numPlantas;

    // Constructor
    public Adosado(String calle, int superficieEnMetros, int numPlantas) {
        super(calle, superficieEnMetros);
        this.numPlantas = numPlantas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de plantas: " + numPlantas;
    }
}

