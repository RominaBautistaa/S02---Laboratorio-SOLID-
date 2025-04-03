package solid;


class RepositorioEmpleadosDB implements RepositorioEmpleados {
    @Override
    public void guardar(Empleado empleado) {
        System.out.println("Guardando empleado " + empleado.nombre + " en la base de datos...");
    }
}
