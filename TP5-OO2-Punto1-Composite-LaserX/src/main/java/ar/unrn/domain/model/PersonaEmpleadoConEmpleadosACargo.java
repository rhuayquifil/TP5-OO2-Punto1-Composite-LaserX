package ar.unrn.domain.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersonaEmpleadoConEmpleadosACargo implements Empleado {

	private String nombre;
	private String apellido;
	private double sueldo;
	private List<Empleado> listaEmpleadoACargo;

	public PersonaEmpleadoConEmpleadosACargo(String nombre, String apellido, double sueldo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldo = sueldo;
		this.listaEmpleadoACargo = new ArrayList<Empleado>();
	}

	public void agregarNuevo(Empleado nuevoEmpleado) {
		Objects.requireNonNull(nuevoEmpleado);
		this.listaEmpleadoACargo.add(nuevoEmpleado);
	}

	public double calcularMasaSalarial() {
		double masaSalarialEmpleadosACargo = this.sueldo;

		for (Empleado empleado : listaEmpleadoACargo) {
			masaSalarialEmpleadosACargo += empleado.calcularMasaSalarial();
		}

		return masaSalarialEmpleadosACargo;
	}

//	@Override
//	public void info() {
//		System.out.println(nombre + " " + apellido + ", sueldo: " + sueldo);
//		for (Empleado empleado : listaEmpleadoACargo) {
//			empleado.info();
//		}
//
//	}

	@Override
	public double sueldo() {
		return this.sueldo;
	}

}
