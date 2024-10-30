/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeEmpleadosInventado;

/**
 *
 * @author admin
 */
// Clase EmpleadoTiempoCompleto que hereda de Empleado
public class EmpleadoTiempoCompleto extends Empleado {
    private int horasExtra;

    // Constructor
    public EmpleadoTiempoCompleto(String nombre, String id, double salario, int horasExtra) {
        super(nombre, id, salario);
        this.horasExtra = horasExtra;
    }

    @Override
    public double calcularBonificacion() {
        double bonificacionBase = super.calcularBonificacion();
        return bonificacionBase + (horasExtra * getSalario() * 0.05); // 5% extra por cada hora extra
    }
}

