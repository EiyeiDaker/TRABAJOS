/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multiviviendas;

/**
 *
 * @author admin
 */
public class Chalet extends Vivienda {
    private int numParcela;
    private boolean conPiscina;

    // Constructor
    public Chalet(String calle, int superficieEnMetros, int numParcela, boolean conPiscina) {
        super(calle, superficieEnMetros);
        this.numParcela = numParcela;
        this.conPiscina = conPiscina;
    }

    @Override
    public double calcularPrecio() {
        return superficieEnMetros * 1300; // Precio específico para chalet
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de parcela: " + numParcela + ", Con piscina: " + (conPiscina ? "Sí" : "No");
    }
}
