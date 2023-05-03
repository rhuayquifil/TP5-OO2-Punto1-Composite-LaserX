package ar.unrn.domain.model;

import java.util.List;

public class Empresa {

	private String nombre;
	private List<Empleado> empleados;

	public Empresa(String nombre, List<Empleado> listaEmpleadosEmpresa) {
		this.nombre = nombre;
		this.empleados = listaEmpleadosEmpresa;
	}

	public double calcularMasaSalarial() {
		double masaSalarial = 0;
		for (Empleado empleado : empleados) {
			masaSalarial += empleado.calcularMasaSalarial();
		}
		return masaSalarial;
//		return empleados.calcularMasaSalarial();
	}

}
