package mx.unam.fi.poo.g1.p8.Practica8.Practica81;
import mx.unam.fi.poo.g1.p8.Practica8.Practica81.Ordenamiento1;

/**
 * La clase QuickSort implementa la interfaz Ordenamiento1 y sobreescribe los métodos
 * para ordenar mediante QuickSort.
 */
public class QuickSort implements Ordenamiento1 {

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
     * Realiza la partición del arreglo para el algoritmo QuickSort.
     *
     * @param numeros -> el arreglo de enteros a particionar
     * @param begin -> el índice inicial del arreglo
     * @param end -> el índice final del arreglo
     * @return el índice de partición
     */
    private int partition(int numeros[], int begin, int end) {
        int pivote = numeros[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (numeros[j] <= pivote) {
                i++;
                int temp = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = temp;
            }
        }

        int temp = numeros[i + 1];
        numeros[i + 1] = numeros[end];
        numeros[end] = temp;

        return (i + 1);
    }

    /**
     * Implementa el algoritmo QuickSort para ordenar el arreglo.
     *
     * @param numeros -> el arreglo de enteros a ordenar
     * @param begin -> el índice inicial del arreglo
     * @param end -> el índice final del arreglo
     */
    private void quickSort(int numeros[], int begin, int end) {
        if (begin < end) {
            int pi = partition(numeros, begin, end);

            quickSort(numeros, begin, pi - 1);
            quickSort(numeros, pi + 1, end);
        }
    }

    /**
     * Ordena el arreglo de enteros proporcionado utilizando el algoritmo QuickSort.
     *
     * @param arr -> el arreglo de enteros a ordenar
     */
    @Override
    public void Sort(int[] arr) {
        this.setTam(arr.length);
        quickSort(arr, 0, this.getTam() - 1);
    }
}
