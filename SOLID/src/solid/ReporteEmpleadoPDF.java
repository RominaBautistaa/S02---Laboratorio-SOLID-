package solid;


class ReporteEmpleadoPDF implements ReporteEmpleados {
    @Override
    public void generar(Empleado empleado) {
        System.out.println("Generando reporte en PDF para el empleado " + empleado.nombre + "...");
    }
}