package ar.unrn.domain.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListaEmpleados {

	private List<Empleado> listaEmpleadoACargo;

	public ListaEmpleados() {
		super();
		this.listaEmpleadoACargo = new ArrayList<>();
	}

	public void agregar(Empleado nuevoEmpleado) {
		Objects.requireNonNull(nuevoEmpleado);
		this.listaEmpleadoACargo.add(nuevoEmpleado);
	}

	public double calcularMasaSalarial() {
		double masaSalarialEmpleadosACargo = 0;

		for (Empleado empleado : listaEmpleadoACargo) {
			masaSalarialEmpleadosACargo += empleado.calcularMasaSalarial();
		}

		return masaSalarialEmpleadosACargo;
	}
}
