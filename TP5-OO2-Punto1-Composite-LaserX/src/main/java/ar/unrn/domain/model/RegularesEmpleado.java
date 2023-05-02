package ar.unrn.domain.model;

public class RegularesEmpleado implements Empleado {

	private Persona persona;

	public RegularesEmpleado(Persona persona) {
		super();
		this.persona = persona;
	}

	public void agregarNuevo(Empleado empleado) {
	}

	public void info() {
		System.out.println("Regular: " + persona.info());
	}

	public int sueldo() {
		return this.persona.sueldo();
	}
}
