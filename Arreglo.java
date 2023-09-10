
/**
 *Creación de arreglo de enteros:
 * 
 * El constructor le pide al usuario ingresar la longitud del arreglo,además 
 * el usuario debe ingresar cada uno de los números que contiene el arreglo.
 * 
 * El método maximo() devuelve el máximo de los números del arreglo.
 * El método mínimo() devuelve el mínimo de los números del arreglo.
 * El método media() devuelve el promedio de los números del arreglo.
 * El método BurbujaMayorAMenor() devuelve el arreglo ordenado de mayor a menor
 * utilizando el algoritmo de ordenamiento burbuja.
 * El método BurbujaMenorAMayor() devuelve el arreglo ordenado de menor a mayor
 * utilizando el algoritmo de ordenamiento burbuja.
 * 
 * Autor: Ximena Itzel Rangel Ramos 
 * Fecha: 10/09/23
 */

import java.util.Scanner;

public class Arreglo {
    
    int[] vector;
    
    public Arreglo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa la dimensión del arreglo");
        int longitud = in.nextInt();
        vector = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            System.out.println("Ingresa el número de la posición " + (i + 1));
            int numero = in.nextInt();
            vector[i] = numero;
        }
    }
    
    public int maximo() {
        int max = vector[0]; 
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > max) {
                max = vector[i];
            }
        }
        return max;
    }
    
    public int minimo() {
        int min = vector[0]; 
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < min) {
                min = vector[i];
            }
        }
        return min;
    }
    
    public double media() {
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        return (double) suma / vector.length; 
    }
    
    public void BurbujaMenorAMayor() {
    for (int i = 0; i < vector.length - 1; i++) {
        for (int j = 0; j < vector.length - 1; j++) {
            if (vector[j] > vector[j + 1]) {
                int x = vector[j];
                vector[j] = vector[j + 1];
                vector[j + 1] = x;
            }
        }
    }
    
    System.out.println("Arreglo ordenado de menor a mayor:");
    for (int i = 0; i < vector.length; i++) {
        System.out.print(vector[i] + " ");
    }
    System.out.println(); 
}

public void BurbujaMayorAMenor() {
    for (int i = 0; i < vector.length - 1; i++) {
        for (int j = 0; j < vector.length - 1; j++) {
            if (vector[j] < vector[j + 1]) {
                int x = vector[j];
                vector[j] = vector[j + 1];
                vector[j + 1] = x;
            }
        }
    }
    
    System.out.println("Arreglo ordenado de mayor a menor:");
    for (int i = 0; i < vector.length; i++) {
        System.out.print(vector[i] + " ");
    }
    System.out.println(); 
}

}
