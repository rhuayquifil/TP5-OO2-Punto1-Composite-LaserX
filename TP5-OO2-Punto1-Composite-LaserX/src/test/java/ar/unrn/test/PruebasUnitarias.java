package ar.unrn.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.unrn.domain.model.Empleado;
import ar.unrn.domain.model.Empresa;
import ar.unrn.domain.model.LiderDeProyectoPersonaEmpleado;
import ar.unrn.domain.model.ListaEmpleados;
import ar.unrn.domain.model.RegularPersonaEmpleado;

class PruebasUnitarias {

	@Test
	void DosRegularesYUnLiderDeProyecto() {
		Empleado regular1 = new RegularPersonaEmpleado("Rodrigo", "Huayquifil", 10);
		Empleado regular2 = new RegularPersonaEmpleado("Ezequiel", "Huayquifil", 10);

		Empleado liderDeProyecto1 = new LiderDeProyectoPersonaEmpleado("Manu", "Ibanez", 20);
		liderDeProyecto1.agregarNuevo(regular1);
		liderDeProyecto1.agregarNuevo(regular2);

		ListaEmpleados listaEmpleadosEmpresa = new ListaEmpleados();
		listaEmpleadosEmpresa.agregar(liderDeProyecto1);

		Empresa empresa = new Empresa("Mi Empresa", listaEmpleadosEmpresa);

		assertEquals(40, empresa.calcularMasaSalarial());
	}

}
