/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coches;

/**
 *
 * @author admin
 */
// Clase CocheMatriculado que hereda de Coche
public class CocheMatriculado extends Coche {
    private int anioMatriculacion; // Año de matriculación
    private int mesMatriculacion; // Mes de matriculación
    private double impuestoMatriculacion; // Impuesto de matriculación

    // Constructor
    public CocheMatriculado(String marca, String color, double precio, double factorContaminacion, int anio,
                            String matricula, String dniTitular, int anioMatriculacion, int mesMatriculacion) {
        super(marca, color, precio, factorContaminacion, anio);
        setMatricula(matricula);
        setDniTitular(dniTitular);
        this.anioMatriculacion = anioMatriculacion;
        this.mesMatriculacion = mesMatriculacion;
        calculaImpuestoMatriculacion();
    }

    // Método para calcular el impuesto de matriculación
    public void calculaImpuestoMatriculacion() {
        impuestoMatriculacion = precio / 20; // 1/20 del precio
        if (2023 - getAnio() > 10) { // Si el coche tiene más de 10 años
            impuestoMatriculacion += 100; // Recargo de 100 euros
        }
    }

    // Métodos de acceso
    public int getAnioMatriculacion() {
        return anioMatriculacion;
    }

    public void setAnioMatriculacion(int anioMatriculacion) {
        this.anioMatriculacion = anioMatriculacion;
    }

    public int getMesMatriculacion() {
        return mesMatriculacion;
    }

    public void setMesMatriculacion(int mesMatriculacion) {
        this.mesMatriculacion = mesMatriculacion;
    }

    public double getImpuestoMatriculacion() {
        return impuestoMatriculacion;
    }

    public void setImpuestoMatriculacion(double impuestoMatriculacion) {
        this.impuestoMatriculacion = impuestoMatriculacion;
        calculaImpuestoMatriculacion(); // Recalcular el impuesto
    }

    @Override
    public String toString() {
        return "Coche Matriculado [Marca: " + getMarca() + ", Color: " + getColor() +
               ", Kilómetros: " + getKm() + ", Precio: " + getPrecio() +
               ", Factor Contaminación: " + getFactorContaminacion() +
               ", Año: " + getAnio() + ", Matrícula: " + getMatricula() +
               ", DNI Titular: " + getDniTitular() +
               ", Año Matriculación: " + anioMatriculacion +
               ", Mes Matriculación: " + mesMatriculacion +
               ", Impuesto Matriculación: " + impuestoMatriculacion + "]";
    }
}

