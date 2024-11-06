/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GarajeDeVehiculos;

/**
 *
 * @author Edgar Jesid Velez Castellanos 20241222443
 */
import java.util.ArrayList;

public class Garaje implements iGaraje {
    private ArrayList<Vehiculo> vehiculos; // Usamos ArrayList directamente
    public static final int NUMERO_MAXIMO_PLACAS = 10; // Número máximo de plazas

    public Garaje() {
        vehiculos = new ArrayList<>();
    }

    @Override
    public double calcularIngresos() {
        double ingresos = 0;
        for (Vehiculo vehiculo : vehiculos) {
            ingresos += vehiculo.getCuotaMesGaraje();
        }
        return ingresos;
    }

    @Override
    public int calcularOcupacionPorTipoVehiculo(Vehiculo v) {
        int count = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getClass().equals(v.getClass())) {
                count++;
            }
        }
        return count;
    }

   public boolean alquilarEspacio(Vehiculo v) {
    if (vehiculos.size() >= NUMERO_MAXIMO_PLACAS) {
        System.out.println("No hay más plazas disponibles.");
        return false;
    }

    int numMotos = calcularOcupacionPorTipoVehiculo(new Moto("", 0, 0, false));
    if (v instanceof Moto && numMotos >= NUMERO_MAXIMO_PLACAS * 0.8) {
        System.out.println("No se puede alquilar más del 80% de las plazas para motos.");
        return false;
    }

    if (v.getMatricula() == null) {
        System.out.println("El vehículo no tiene matrícula.");
        return false;
    }

    vehiculos.add(v);
    return true;
}



    public boolean retirarVehiculo(String matricula) {
        for (Vehiculo v : vehiculos) {
            if (v.getMatricula().equals(matricula)) {
                vehiculos.remove(v);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}
