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

    // Método de ordenamiento por selección
    public static void seleccion(int[] arr) {
        int n = arr.length;

        // Recorre todos los elementos del arreglo (Operación de O(n) por cada iteración)
        for (int i = 0; i < n - 1; i++) { 
            // Encuentra el índice del valor mínimo en el subarreglo no ordenado (Operación de O(n) en cada iteración del segundo bucle)
            int minIdx = i;

            // Segundo bucle para encontrar el valor mínimo (Operaciones de O(n) comparaciones)
                for (int j = i + 1; j < n; j++) { 
                // Comparación entre elementos (Operación elemental O(1) por cada iteración)
                if (arr[j] < arr[minIdx]) {
                    minIdx = j; // Actualización del índice mínimo (Operación de O(1))
                }
            }

            // Si el índice mínimo no es el actual, realiza el intercambio (Operación de O(1) en el peor caso)
            if (minIdx != i) {
                // Intercambio de valores si se encuentra un mínimo (Operaciones de O(1) para cada asignación)
                int temp = arr[i];      // Asignación O(1)
                arr[i] = arr[minIdx];   // Asignación O(1)
                arr[minIdx] = temp;     // Asignación O(1)
            }
        }
    }


    // Método de ordenamiento por inserción
    public static void insercion(int[] arr) {
        // Recorremos el arreglo comenzando desde el segundo elemento
        for (int i = 1; i < arr.length; i++) {  // Comparación O(1) e incremento O(1)
            int key = arr[i];  // Asignación O(1)
            int j = i - 1;  // Asignación O(1)

            // Desplazamos los elementos que son mayores que la key una posición hacia la derecha
            while (j >= 0 && arr[j] > key) {  // Comparación O(1) por cada iteración
                arr[j + 1] = arr[j];  // Asignación O(1)
                j--;  // Decremento O(1)
            }
            arr[j + 1] = key;  // Asignación O(1)
        }
    }
}



    

