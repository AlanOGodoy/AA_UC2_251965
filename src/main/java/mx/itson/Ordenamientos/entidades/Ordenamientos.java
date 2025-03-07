/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.Ordenamientos.entidades;

/**
 *
 * @author alang
 */
public class Ordenamientos {

    // Método de ordenamiento burbuja
    public static void burbuja(int[] arr) {
        // El primer ciclo tiene O(n) iteraciones
        for (int i = 0; i < arr.length - 1; i++) {  // Incremento de 'i' O(1) -> Comparación O(1) por cada iteración
            // El segundo ciclo tiene O(n-i-1) iteraciones (esto va reduciendo con cada pasada)
            for (int j = 0; j < arr.length - 1 - i; j++) {  // Incremento de 'j' O(1) -> Comparación O(1) por cada iteración
                // Comparación entre arr[j] y arr[j+1] - O(1) por cada iteración
                if (arr[j] > arr[j + 1]) {  // Comparación O(1)
                    // Intercambio de elementos - O(1) por cada iteración
                    int temp = arr[j];  // Asignación O(1)
                    arr[j] = arr[j + 1]; // Asignación O(1)
                    arr[j + 1] = temp;   // Asignación O(1)
                }
            }
        }
    }
}


    

