/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeEstudiantes;

/**
 *
 * @author admin
 */
public class EstudianteMaestria extends Estudiante {
    private String especialidad;

    // Constructor
    public EstudianteMaestria(String nombre, String id, double notaFinal, String especialidad) {
        super(nombre, id, notaFinal);
        this.especialidad = especialidad;
    }

    @Override
    public String obtenerEstado() {
        return "Estudiante de Maestría " + super.obtenerEstado();
    }

    // Getter
    public String getEspecialidad() {
        return especialidad;
    }
}

