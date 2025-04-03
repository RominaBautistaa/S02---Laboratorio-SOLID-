package solid;


class SistemaGestionEmpleados {
    private final RepositorioEmpleados repositorio;
    private final ReporteEmpleados reporte;

    public SistemaGestionEmpleados(RepositorioEmpleados repositorio, ReporteEmpleados reporte) {
        this.repositorio = repositorio;
        this.reporte = reporte;
    }

    public void procesarEmpleado(Empleado empleado) {
        double pago = empleado.calcularPago();
        System.out.println("Pago calculado para " + empleado.nombre + ": " + pago);
        repositorio.guardar(empleado);
        reporte.generar(empleado);
    }
}
