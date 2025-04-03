/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solid;

import java.util.*;

public class SOLID {
    public static void main(String[] args) {
        RepositorioEmpleados repositorio = new RepositorioEmpleadosDB();
        ReporteEmpleados reporte = new ReporteEmpleadoPDF();
        SistemaGestionEmpleados sistema = new SistemaGestionEmpleados(repositorio, reporte);
        
        Empleado gerente = new Gerente("Juan", 5000);
        Empleado desarrollador = new Desarrollador("Ana", 3000);
        Empleado practicante = new Practicante("Luis", 1000);
        
        sistema.procesarEmpleado(gerente);
        sistema.procesarEmpleado(desarrollador);
        sistema.procesarEmpleado(practicante);
    }
}
