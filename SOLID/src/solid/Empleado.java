package solid;

// 1. Separación en clases especializadas para cálculo de pago
// Clase Empleado
abstract class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public abstract double calcularPago();
}
