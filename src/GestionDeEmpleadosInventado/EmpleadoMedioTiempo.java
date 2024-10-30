/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeEmpleadosInventado;

/**
 *
 * @author admin
 */
// Clase EmpleadoMedioTiempo que hereda de Empleado
public class EmpleadoMedioTiempo extends Empleado {
    // Constructor
    public EmpleadoMedioTiempo(String nombre, String id, double salario) {
        super(nombre, id, salario);
    }

    @Override
    public double calcularBonificacion() {
        return super.calcularBonificacion(); // No se añade bonificación adicional
    }
}

