package ar.unrn.domain.model;

public class RegularPersonaEmpleado extends PersonaEmpleado {

	public RegularPersonaEmpleado(String nombre, String apellido, double sueldo) {
		super(nombre, apellido, sueldo);
	}

	@Override
	public void agregarNuevo(Empleado empleado) {
	}

	@Override
	public double calcularMasaSalarial() {
		return super.sueldo();
	}
}
