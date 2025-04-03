package solid;


class Practicante extends Empleado {
    public Practicante(String nombre, double salario) {
        super(nombre, salario);
    }
    @Override
    public double calcularPago() {
        return salario * 0.5; // Medio salario para practicantes
    }
}