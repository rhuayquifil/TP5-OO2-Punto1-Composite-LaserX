package ar.unrn.domain.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DirectorEmpleado implements Empleado {

	private String nombre;
	private String apellido;
	private int sueldo;
	private List<Empleado> listaEmpleadoACargo;

	public DirectorEmpleado(String nombre, String apellido, int sueldo) {
		super();
		this.sueldo = sueldo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.listaEmpleadoACargo = new ArrayList<Empleado>();
	}

	public void agregarNuevo(Empleado empleado) {
		Objects.requireNonNull(empleado);
		this.listaEmpleadoACargo.add(empleado);
	}

	public void info() {
		System.out.println("Gerente: " + nombre + " " + apellido + ", sueldo: " + sueldo);
		for (Empleado empleado : listaEmpleadoACargo) {
			empleado.info();
		}
	}

	public int sueldo() {
		int masaSalarialEmpleadosACargo = 0;

		for (Empleado empleado : listaEmpleadoACargo) {
			masaSalarialEmpleadosACargo += empleado.sueldo();
		}

		return masaSalarialEmpleadosACargo + this.sueldo;
	}
}
