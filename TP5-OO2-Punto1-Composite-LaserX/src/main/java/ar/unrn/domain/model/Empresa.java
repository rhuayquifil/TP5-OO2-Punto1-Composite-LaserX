package ar.unrn.domain.model;

public class Empresa {

	private String nombre;
	private ListaEmpleados empleados;

	public Empresa(String nombre, ListaEmpleados listaEmpleadosEmpresa) {
		this.nombre = nombre;
		this.empleados = listaEmpleadosEmpresa;
	}

	public double calcularMasaSalarial() {
		return empleados.calcularMasaSalarial();
	}

}
