package ar.unrn.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.unrn.domain.model.Empleado;
import ar.unrn.domain.model.Empresa;
import ar.unrn.domain.model.PersonaEmpleadoConEmpleadosACargo;
import ar.unrn.domain.model.RegularPersonaEmpleado;

class PruebasUnitarias {

	@Test
	void DosRegularesYUnLiderDeProyecto() {
		Empleado regular1 = new RegularPersonaEmpleado("Rodrigo", "Huayquifil", 10);
		Empleado regular2 = new RegularPersonaEmpleado("Ezequiel", "Huayquifil", 10);

		Empleado liderDeProyecto = new PersonaEmpleadoConEmpleadosACargo("Manu", "Ibanez", 20);
		liderDeProyecto.agregarNuevo(regular1);
		liderDeProyecto.agregarNuevo(regular2);

		List<Empleado> listaEmpleadosEmpresa = new ArrayList<>();
		listaEmpleadosEmpresa.add(liderDeProyecto);

		Empresa empresa = new Empresa("Mi Empresa", listaEmpleadosEmpresa);

		assertEquals(40, empresa.calcularMasaSalarial());
	}

}
