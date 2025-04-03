package solid;


class Desarrollador extends Empleado {
    public Desarrollador(String nombre, double salario) {
        super(nombre, salario);
    }
    @Override
    public double calcularPago() {
        return salario;
    }
}