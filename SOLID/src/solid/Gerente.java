package solid;


    class Gerente extends Empleado {
    public Gerente(String nombre, double salario) {
        super(nombre, salario);
    }
    @Override
    public double calcularPago() {
        return salario + 1000; // Bono para gerentes
    }
}

