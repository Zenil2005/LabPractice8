package mx.unam.fi.poo.g1.p8.Practica8.Practica82;
import mx.unam.fi.poo.g1.p8.Practica8.Practica82.Empleado;

/**
 * La clase Programador extiende la clase Empleado y proporciona métodos adicionales
 * para gestionar el salario de un programador.
 */
public class Programador extends Empleado {
    private double salario;

    /**
     * Constructor de la clase Programador.
     *
     * @param nombre -> el nombre del programador
     * @param salario -> el salario inicial del programador
     */
    public Programador(String nombre, double salario) {
        super(nombre);
        setRol("Programador");
        setSalario(salario);
    }

    /**
     * Método set:
     * Establece el salario del programador.
     *
     * @param salario -> el salario del programador
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Método get:
     * Obtiene el salario del programador.
     *
     * @return el salario del programador
     */
    public double getSalario() {
        return this.salario;
    }

    /**
     * Imprime los datos del programador, incluyendo nombre, rol y salario.
     */
    public void printDatos() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Rol: " + this.getRol());
        System.out.println("Salario: " + this.getSalario());
    }

    /**
     * Calcula el salario del programador basado en el porcentaje proporcionado.
     *
     * @param porcentaje -> el porcentaje para calcular el salario
     */
    @Override
    public void calcularSalario(double porcentaje) {
        this.salario += getSalario() * porcentaje / 100;
    }
}
