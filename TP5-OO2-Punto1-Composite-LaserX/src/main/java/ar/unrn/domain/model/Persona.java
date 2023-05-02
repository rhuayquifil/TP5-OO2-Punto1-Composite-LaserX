package ar.unrn.domain.model;

public record Persona(String nombre, String apellido, int sueldo) {

	public String info() {
		return (nombre + " " + apellido + ", sueldo: " + sueldo);
	}

}
