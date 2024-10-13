package mx.unam.fi.poo.g1.p8.Practica8.Practica81;
import mx.unam.fi.poo.g1.p8.Practica8.Practica81.*;

/**
 * Clase principal del Proyecto 1
 * @author Grupo 1 de POO
 * @version Octubre de 2024
 */

public class Practica81 {

    /**
     * Metodo main
     * Se ejecuta todo el funcionamiento de la aplicación 
     * @param args -> Arreglo por defecto del metodo main
     */
    public static void main(String[] args) {
        int numeros1[] = {12, 2, 43, 74, 5, 36};
        int numeros2[] = {23, 42, 54, 67, 12, 10};

        MergeSort merge = new MergeSort();
        QuickSort quick = new QuickSort();

        System.out.println("Los arreglos desordenados son: ");
        imprime(numeros1);
        imprime(numeros2);

        merge.Sort(numeros2);
        quick.Sort(numeros1);

        System.out.println("\nLos arreglos ordenados son: ");
        System.out.print("Por MergeSort: ");
        imprime(numeros1);
        System.err.print("Por QuickSort: ");
        imprime(numeros2);
    }

    /**
     * Imprime los elementos de un arreglo de enteros.
     *
     * @param arr -> el arreglo de enteros a imprimir
     */

    public static void imprime(int[] arr) {
        int index = 0;
        for (int i : arr) {
            if (index != arr.length - 1) {
                System.err.print(i + ", ");
            } else {
                System.out.print(i);
            }
            index++;
        }
        System.out.println();
    }
}
