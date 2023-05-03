package ar.unrn.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import ar.unrn.domain.model.Empleado;
import ar.unrn.domain.model.Empresa;
import ar.unrn.domain.model.PersonaEmpleadoConEmpleadosACargo;
import ar.unrn.domain.model.RegularPersonaEmpleado;

class PruebasUnitarias {

//	@Test
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

//	@Test
	void todosConPersonasACargoMenosEmpleadoRegular() {
		Empleado regular1 = new RegularPersonaEmpleado("octavio", "fernandez", 10);

		Empleado liderDeProyecto1 = new PersonaEmpleadoConEmpleadosACargo("manuel", "lopez", 20);
		liderDeProyecto1.agregarNuevo(regular1);

		Empleado liderDeProyecto2 = new PersonaEmpleadoConEmpleadosACargo("italo", "ibanez", 20);
//		liderDeProyecto2.agregarNuevo(regular2);

		Empleado mandoMedio1 = new PersonaEmpleadoConEmpleadosACargo("franco", "gomez", 30);
		mandoMedio1.agregarNuevo(liderDeProyecto1);
		mandoMedio1.agregarNuevo(liderDeProyecto2);

		Empleado gerente1 = new PersonaEmpleadoConEmpleadosACargo("fabiana", "tolosa", 40);
		gerente1.agregarNuevo(mandoMedio1);

		Empleado director1 = new PersonaEmpleadoConEmpleadosACargo("HUAYQUIFIL", "HUAYQUIFIL", 50);
		director1.agregarNuevo(gerente1);

		List<Empleado> listaEmpleadosEmpresa = new ArrayList<>();
		listaEmpleadosEmpresa.add(director1);

		Empresa empresa = new Empresa("Mi Empresa", listaEmpleadosEmpresa);

		assertEquals(170, empresa.calcularMasaSalarial());
	}

}
