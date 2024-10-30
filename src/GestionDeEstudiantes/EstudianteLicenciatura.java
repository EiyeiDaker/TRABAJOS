/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeEstudiantes;

/**
 *
 * @author admin
 */
public class EstudianteLicenciatura extends Estudiante {
    private String carrera;

    // Constructor
    public EstudianteLicenciatura(String nombre, String id, double notaFinal, String carrera) {
        super(nombre, id, notaFinal);
        this.carrera = carrera;
    }

    @Override
    public String obtenerEstado() {
        return "Estudiante de Licenciatura " + super.obtenerEstado();
    }

    // Getter
    public String getCarrera() {
        return carrera;
    }
}

