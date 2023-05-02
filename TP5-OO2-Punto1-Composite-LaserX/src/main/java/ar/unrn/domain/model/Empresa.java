package ar.unrn.domain.model;

public class Empresa {

	private String nombre;
	private Empleado empleado;

	public Empresa(String nombre, Empleado empleado) {
		this.nombre = nombre;
		this.empleado = empleado;
	}

	public int calcularMasaSalarial() {
		return empleado.sueldo();
	}

}
