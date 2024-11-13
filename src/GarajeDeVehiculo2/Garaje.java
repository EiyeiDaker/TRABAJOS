/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GarajeDeVehiculo2;

/**
 *
 * @author admin
 */


import java.util.ArrayList;

public class Garaje {
    private ArrayList<Vehiculo> vehiculos;  // Lista de vehículos en el garaje
    private static final double PORCENTAJE_CAMIONES = 0.10;  // 10% de espacios para camiones
    private int espaciosTotales;  // Total de espacios disponibles en el garaje
    private int espaciosOcupados;  // Espacios ocupados

    // Constructor
    public Garaje(int espaciosTotales) {
        this.vehiculos = new ArrayList<>();
        this.espaciosTotales = espaciosTotales;
        this.espaciosOcupados = 0;
    }


   public boolean alquilarEspacio(Vehiculo v) {
    // Verificamos si hay espacio disponible en el garaje
    if (espaciosOcupados < espaciosTotales) {
        // Si es un camión, verificamos que no se exceda el 10% de los espacios
        if (v instanceof Camion) {
            // Calcular el número de camiones en total (sencillos y dobles)
            int camiones = contarCamionesPorTipo("Sencillo") + contarCamionesPorTipo("Doble");
            // Validar si el número de camiones excede el 10% de los espacios totales
            if (camiones >= espaciosTotales * PORCENTAJE_CAMIONES) {
                System.out.println("Ya se ha alcanzado el límite de camiones en el garaje.");
                return false;
            }
        }
        // Alquilamos el espacio
        vehiculos.add(v);  // Añadimos el vehículo al garaje
        espaciosOcupados++;  // Aumentamos el número de espacios ocupados
        return true;
    } else {
        System.out.println("No hay espacio disponible en el garaje.");
        return false;
    }
}

    // Método para contar camiones por tipo (Sencillo o Doble)
    public int contarCamionesPorTipo(String tipo) {
        int count = 0;
        for (Vehiculo v : vehiculos) {
            if (v instanceof Camion) {
                Camion camion = (Camion) v;
                if (camion.getTipoCamion().equalsIgnoreCase(tipo)) {
                    count++;
                }
            }
        }
        return count;
    }

    // Método para buscar un vehículo por matrícula
    public int buscarVehiculoPorMatricula(String matricula) {
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getMatricula().equals(matricula)) {
                return i;  // Retorna la posición del vehículo
            }
        }
        return -1;  // Retorna -1 si no se encuentra el vehículo
    }

    // Método para calcular la proporción de autos, motos y camiones
    public void calcularProporcionVehiculos() {
        int numAutos = 0, numMotos = 0, numCamiones = 0;
        for (Vehiculo v : vehiculos) {
            if (v instanceof Auto) {
                numAutos++;
            } else if (v instanceof Moto) {
                numMotos++;
            } else if (v instanceof Camion) {
                numCamiones++;
            }
        }

        int total = numAutos + numMotos + numCamiones;
        if (total > 0) {
            System.out.println("Proporción de Autos: " + ((double) numAutos / total));
            System.out.println("Proporción de Motos: " + ((double) numMotos / total));
            System.out.println("Proporción de Camiones: " + ((double) numCamiones / total));
        } else {
            System.out.println("No hay vehículos en el garaje.");
        }
    }

    // Método para consultar la cantidad de plazas disponibles
    public int plazasDisponibles() {
        return espaciosTotales - espaciosOcupados;
    }

    // Método para obtener los vehículos en el garaje
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    // Método para calcular los ingresos del garaje
    public double calcularIngresos() {
        double ingresos = 0;
        for (Vehiculo v : vehiculos) {
            ingresos += v.getCuotaMesGaraje();
        }
        return ingresos;
    }
}
