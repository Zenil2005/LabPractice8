package mx.unam.fi.poo.g1.p8.Practica8.Practica82;
import mx.unam.fi.poo.g1.p8.Practica8.Practica82.*;

/**
 * Clase principal del Proyecto 1
 * @author Grupo 1 de POO
 * @version Septiembre de 2024
 */

public class Practica82{

    /**
     * Metodo main
     * Se ejecuta todo el funcionamiento de la aplicación 
     * @param args -> Arreglo por defecto del metodo main
     */
    public static void main(String[] args){
        System.out.println("Estamos probando el siguiente método para interfaces: ");
        Gerente gerente = new Gerente("Pedro", 25000);
        Programador programador = new Programador("Lucia", 18000);
        System.out.println("Los datos del gerente son: ");
        gerente.printDatos();
        System.out.println("Los datos del programador son: ");
        programador.printDatos();
        gerente.calcularSalario(40);
        programador.calcularSalario(20);
        System.out.println("Los datos del gerente después de recibir un aumento del 40 %: ");
        gerente.printDatos();
        System.out.println("Los datos del programador después de recibir un aumento del 20 %: ");
        programador.printDatos();

    }
}