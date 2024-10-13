package mx.unam.fi.poo.g1.p8.Practica8.Practica82;
import mx.unam.fi.poo.g1.p8.Practica8.Practica82.Empleado;

/**
 * La clase Gerente extiende la clase Empleado y proporciona métodos adicionales
 * para gestionar el salario de un gerente.
 */
public class Gerente extends Empleado {
    private double salario;

    /**
     * Constructor de la clase Gerente.
     *
     * @param nombre -> el nombre del gerente
     * @param salario -> el salario inicial del gerente
     */
    public Gerente(String nombre, double salario) {
        super(nombre);
        setRol("Gerente");
        setSalario(salario);
    }

    /**
     * Método set:
     * Establece el salario del gerente.
     *
     * @param salario -> el salario del gerente
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Método get:
     * Obtiene el salario del gerente.
     *
     * @return el salario del gerente
     */
    public double getSalario() {
        return this.salario;
    }

    /**
     * Imprime los datos del gerente, incluyendo nombre, rol y salario.
     */
    public void printDatos() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Rol: " + this.getRol());
        System.out.println("Salario: " + this.getSalario());
    }

    /**
     * Calcula el salario del gerente basado en el porcentaje proporcionado.
     *
     * @param porcentaje -> el porcentaje para calcular el salario
     */
    @Override
    public void calcularSalario(double porcentaje) {
        this.salario += getSalario() * porcentaje / 100;
    }
}
