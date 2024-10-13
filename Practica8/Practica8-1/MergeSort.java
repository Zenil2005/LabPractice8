package mx.unam.fi.poo.g1.p8.Practica8.Practica81;
import mx.unam.fi.poo.g1.p8.Practica8.Practica81.Ordenamiento1;

/**
 * La clase MergeSort implementa la interfaz Ordenamiento1 y sobreescribe los métodos
 * para ordenar mediante MergeSort.
 */
public class MergeSort implements Ordenamiento1 {

    private int tam;

    /**
     * Método set: 
     * Establece el tamaño del arreglo.
     *
     * @param tam -> el tamaño del arreglo
     */
    public void setTam(int tam){
        this.tam = tam;
    }

    /**
     * Método get: 
     * Obtiene el tamaño del arreglo.
     *
     * @return el tamaño del arreglo
     */
    public int getTam(){
        return this.tam;
    }

    /**
     * Combina dos subarreglos de numeros.
     *
     * @param numeros -> el arreglo de enteros a combinar
     * @param begin -> el índice inicial del primer subarreglo
     * @param mitad -> el índice final del primer subarreglo
     * @param end -> el índice final del segundo subarreglo
     */
    private void merge(int numeros[], int begin, int mitad, int end) {
        int n1 = mitad - begin + 1;
        int n2 = end - mitad;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = numeros[begin + i];
        for (int j = 0; j < n2; ++j)
            R[j] = numeros[mitad + 1 + j];

        int i = 0, j = 0;
        int k = begin;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                numeros[k] = L[i];
                i++;
            } else {
                numeros[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            numeros[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            numeros[k] = R[j];
            j++;
            k++;
        }
    }

    /**
     * Implementa el algoritmo Merge Sort para ordenar el arreglo.
     *
     * @param numeros -> el arreglo de enteros a ordenar
     * @param begin -> el índice inicial del arreglo
     * @param end -> el índice final del arreglo
     */
    private void mergeSort(int numeros[], int begin, int end) {
        if (begin < end) {
            int mid = (begin + end) / 2;

            mergeSort(numeros, begin, mid);
            mergeSort(numeros, mid + 1, end);

            merge(numeros, begin, mid, end);
        }
    }

    /**
     * Ordena el arreglo de enteros proporcionado utilizando el algoritmo Merge Sort.
     *
     * @param arr -> el arreglo de enteros a ordenar
     */
    @Override
    public void Sort(int[] arr) {
        this.setTam(arr.length);
        mergeSort(arr, 0, this.getTam() - 1);
    }
}
