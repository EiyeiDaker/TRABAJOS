/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosTipoMath;

/**
 *
 * @author admin
 */
public class Math2 implements IExtremos {
    
    @Override
    public int min(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo o vacío.");
        }
        int min = a[0];
        for (int num : a) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    @Override
    public int max(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo o vacío.");
        }
        int max = a[0];
        for (int num : a) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    @Override
    public double min(double[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo o vacío.");
        }
        double min = a[0];
        for (double num : a) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    @Override
    public double max(double[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo o vacío.");
        }
        double max = a[0];
        for (double num : a) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
