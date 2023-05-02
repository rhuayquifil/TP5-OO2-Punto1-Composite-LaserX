package ar.unrn.domain.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LiderDeProyectoEmpleado implements Empleado {

	private List<Empleado> listaEmpleadoACargo;
	private Persona persona;

	public LiderDeProyectoEmpleado(Persona persona) {
		super();
		this.persona = persona;
		this.listaEmpleadoACargo = new ArrayList<Empleado>();
	}

	public void agregarNuevo(Empleado empleado) {
		Objects.requireNonNull(empleado);
		this.listaEmpleadoACargo.add(empleado);
	}

	public void info() {
		System.out.println("Lider De Proyecto: " + persona.info());
		for (Empleado empleado : listaEmpleadoACargo) {
			empleado.info();
		}
	}

	public int sueldo() {
		int masaSalarialEmpleadosACargo = 0;

		for (Empleado empleado : listaEmpleadoACargo) {
			masaSalarialEmpleadosACargo += empleado.sueldo();
		}

		return masaSalarialEmpleadosACargo + this.persona.sueldo();
	}
}
