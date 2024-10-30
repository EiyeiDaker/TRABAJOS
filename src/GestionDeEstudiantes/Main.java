/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeEstudiantes;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        EstudianteLicenciatura estudiante1 = new EstudianteLicenciatura("Carlos", "L001", 75, "Ingeniería");
        EstudianteMaestria estudiante2 = new EstudianteMaestria("Ana", "M001", 55, "Administración");

        System.out.println(estudiante1.getNombre() + ": " + estudiante1.obtenerEstado());
        System.out.println(estudiante2.getNombre() + ": " + estudiante2.obtenerEstado());
    }
}
