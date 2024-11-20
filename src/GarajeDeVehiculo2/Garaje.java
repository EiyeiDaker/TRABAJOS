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
    private static final double PorcentajeCamioneta= 0.20;  // 20% de espacios para camionetas
    private static final double PorcentajeMotos = 0.30;  // 30% de espacios para motos
    private int espaciosTotales;  // Total de espacios disponibles en el garaje
    private int espaciosOcupados;  // Espacios ocupados

    // Constructor
    public Garaje(int espaciosTotales) {
        this.vehiculos = new ArrayList<>();
        this.espaciosTotales = espaciosTotales;
        this.espaciosOcupados = 0;
    }

    // Método para alquilar espacio
    public boolean alquilarEspacio(Vehiculo v) {
        // Verificamos el espacio disponible en el garaje
        if (espaciosOcupados < espaciosTotales) {
            // Validar si se está excediendo el 20% para camionetas
            if (v instanceof Camioneta) {
                int cantidadCamionetas = contarVehiculosPorTipo(Camioneta.class);
                if (cantidadCamionetas >= espaciosTotales * PorcentajeCamioneta) {
                    System.out.println("Ya se ha alcanzado el límite de camionetas en el garaje.");
                    return false;
                }
            }
            // Validar si se está excediendo el 30% para motos
            if (v instanceof Moto) {
                int cantidadMotos = contarVehiculosPorTipo(Moto.class);
                if (cantidadMotos >= espaciosTotales * PorcentajeMotos) {
                    System.out.println("Ya se ha alcanzado el límite de motos en el garaje.");
                    return false;
                }
            }

            // Alquilar espacio si pasa las validaciones
            vehiculos.add(v);
            espaciosOcupados++;
            return true;
        } else {
            System.out.println("No hay espacio disponible en el garaje.");
            return false;
        }
    }

    // Método para buscar vehículo por matrícula
    public int buscarVehiculoPorMatricula(String matricula) {
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getMatricula().equals(matricula)) {
                return i;  // Retorna la posición del vehículo
            }
        }
        return -99;  // Retorna -99 si no se encuentra el vehículo
    }

    // Método para contar vehículos de un tipo determinado
    public int contarVehiculosPorTipo(Class<?> tipo) {
        int count = 0;
        for (Vehiculo v : vehiculos) {
            if (tipo.isInstance(v)) {
                count++;
            }
        }
        return count;
    }

    // Método para calcular la proporción de vehículos (Auto, Moto, Camioneta)
    public void calcularProporcionVehiculos() {
        int numAutos = contarVehiculosPorTipo(Auto.class);
        int numMotos = contarVehiculosPorTipo(Moto.class);
        int numCamionetas = contarVehiculosPorTipo(Camioneta.class);

        int total = numAutos + numMotos + numCamionetas;
        if (total > 0) {
            System.out.println("Proporción de Autos: " + ((double) numAutos / total));
            System.out.println("Proporción de Motos: " + ((double) numMotos / total));
            System.out.println("Proporción de Camionetas: " + ((double) numCamionetas / total));
        } else {
            System.out.println("No hay vehículos en el garaje.");
        }
    }

    // Método para contar camionetas por tipo (Sencillo/Doble)
    public void contarCamionetasPorTipo() {
        int camionetasSencillo = 0, camionetasDoble = 0;
        for (Vehiculo v : vehiculos) {
            if (v instanceof Camioneta) {
                Camioneta camioneta = (Camioneta) v;
                if ("Sencillo".equalsIgnoreCase(camioneta.getTipoServicio())) {
                    camionetasSencillo++;
                } else if ("Doble".equalsIgnoreCase(camioneta.getTipoServicio())) {
                    camionetasDoble++;
                }
            }
        }
        System.out.println("Camionetas tipo Sencillo: " + camionetasSencillo);
        System.out.println("Camionetas tipo Doble: " + camionetasDoble);
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
