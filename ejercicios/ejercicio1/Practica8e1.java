package mx.unam.fi.poo.g1.p8.ejercicios.ejercicio1;
import mx.unam.fi.poo.g1.p8.ejercicios.ejercicio1.*;

public class Practica8e1{
    public static void main(String[]args){
        int[] arr = {
            4, 2, 0, 3, 1, 6, 8
        };

        Ordenamiento bubble = new BubbleSort();
        bubble.ordenar(arr);
        imprime(arr);

        Ordenamiento selection = new SelectionSort();
        selection.ordenar(arr);
        imprime(arr);
    }

    public static void imprime(int[] arr){
        for (int i: arr){
            System.out.println(i+" ");
        }
        System.out.println();
    }
}
