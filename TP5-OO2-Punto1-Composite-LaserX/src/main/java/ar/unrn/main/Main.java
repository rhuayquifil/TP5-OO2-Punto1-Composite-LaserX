package ar.unrn.main;

import java.util.ArrayList;
import java.util.List;

import ar.unrn.domain.model.Empleado;
import ar.unrn.domain.model.Empresa;
import ar.unrn.domain.model.PersonaEmpleadoConEmpleadosACargo;
import ar.unrn.domain.model.RegularPersonaEmpleado;

public class Main {

	public static void main(String[] args) {
		Empleado regular1 = new RegularPersonaEmpleado("octavio", "fernandez", 10);
		Empleado regular2 = new RegularPersonaEmpleado("ezequiel", "escalante", 10);

		Empleado liderDeProyecto1 = new PersonaEmpleadoConEmpleadosACargo("manuel", "lopez", 20);
		liderDeProyecto1.agregarNuevo(regular1);
		liderDeProyecto1.agregarNuevo(regular2);

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
		System.out.println("MASA SALARIAL: " + empresa.calcularMasaSalarial());
	}

}
