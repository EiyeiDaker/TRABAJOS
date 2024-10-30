/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeEstudiantes;

/**
 *
 * @author admin
 */
public class Estudiante {
    private String nombre;
    private String id;
    private double notaFinal;

    // Constructor
    public Estudiante(String nombre, String id, double notaFinal) {
        this.nombre = nombre;
        this.id = id;
        this.notaFinal = notaFinal;
    }

    // Método para obtener el estado
    public String obtenerEstado() {
        return notaFinal >= 60 ? "Aprobado" : "Reprobado";
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public double getNotaFinal() {
        return notaFinal;
    }
}

