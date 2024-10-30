/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionDeEmpleadosInventado;

/**
 *Ejercicio: Sistema de Gestión de Empleados
Crea un sistema que permita gestionar diferentes tipos de empleados en una empresa utilizando herencia. Las clases que deberás implementar son:

Clase Empleado:

Atributos:
String nombre
String id
double salario
Métodos:
Constructor para inicializar todos los atributos.
Método double calcularBonificacion() que devuelve el 10% del salario.
Clase EmpleadoTiempoCompleto (hereda de Empleado):

Atributos:
int horasExtra
Métodos:
Constructor que incluya las horas extras.
Override del método calcularBonificacion() para incluir un 5% adicional por cada hora extra trabajada.
Clase EmpleadoMedioTiempo (hereda de Empleado):

Métodos:
Constructor que inicializa solo el nombre, id y salario.
Override del método calcularBonificacion() que no añade ninguna bonificación adicional.
Clase Principal:

Crea instancias de EmpleadoTiempoCompleto y EmpleadoMedioTiempo y muestra la bonificación calculada para cada uno.
 * @author admin
 */
// Clase base Empleado
public class Empleado {
    private String nombre;
    private String id;
    private double salario;

    // Constructor
    public Empleado(String nombre, String id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    // Método para calcular la bonificación
    public double calcularBonificacion() {
        return salario * 0.10; // 10% del salario
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }
}

