package mx.unam.fi.poo.g1.p8.Practica8.Practica82;
import mx.unam.fi.poo.g1.p8.Practica8.Practica82.Salario;

/**
 * La clase Empleado implementa la interfaz Salario y proporciona métodos
 * para gestionar la información de un empleado y calcular su salario.
 */
public class Empleado implements Salario {
    private String nombre;
    private String rol;

    /**
     * Constructor de la clase Empleado.
     *
     * @param nombre -> el nombre del empleado
     */
    public Empleado(String nombre) {
        setNombre(nombre);
    }

    /**
     *Método set:
     * Establece el nombre del empleado.
     *
     * @param nombre -> el nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método get:
     * Obtiene el nombre del empleado.
     *
     * @return el nombre del empleado
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Método set:
     * Establece el rol del empleado.
     *
     * @param rol el rol del empleado
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * Método get:
     * Obtiene el rol del empleado.
     *
     * @return el rol del empleado
     */
    public String getRol() {
        return this.rol;
    }

    /**
     * Calcula el salario del empleado basado en el porcentaje proporcionado.
     *
     * @param porcentaje -> el porcentaje para calcular el salario
     */
    @Override
    public void calcularSalario(double porcentaje) {
        System.out.println("Este método calcula el salario del empleado");
    }
}
