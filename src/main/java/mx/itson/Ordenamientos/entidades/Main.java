/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.Ordenamientos.entidades;

/**
 *
 * @author alang
 */
public class Main {

    public static void main(String[] args) {
        int[] arreglo = {64, 34, 25, 12, 22, 11, 90};

        // Imprime el arreglo original (O(n))
        System.out.print("Arreglo original: ");
        for (int i : arreglo) { // O(n) iteraciones para imprimir el arreglo
            System.out.print(i + " "); // O(1) por cada iteración
        }
        System.out.println(); // O(1)

        // Llamada al método de ordenamiento burbuja desde la clase Ordenamiento (O(n²))
        Ordenamientos.burbuja(arreglo);  // O(n²) por el método de ordenamiento

        // Imprime el arreglo ordenado (O(n))
        System.out.print("Arreglo ordenado: ");
        for (int i : arreglo) { // O(n) iteraciones para imprimir el arreglo
            System.out.print(i + " "); // O(1) por cada iteración
        }
    }
    
}

