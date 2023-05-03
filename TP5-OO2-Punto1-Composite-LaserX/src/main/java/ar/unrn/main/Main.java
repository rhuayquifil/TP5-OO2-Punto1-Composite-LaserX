package ar.unrn.main;

import ar.unrn.domain.model.DirectorPersonaEmpleado;
import ar.unrn.domain.model.Empleado;
import ar.unrn.domain.model.Empresa;
import ar.unrn.domain.model.GerentePersonaEmpleado;
import ar.unrn.domain.model.LiderDeProyectoPersonaEmpleado;
import ar.unrn.domain.model.ListaEmpleados;
import ar.unrn.domain.model.MandosMediosPersonaEmpleado;
import ar.unrn.domain.model.RegularPersonaEmpleado;

public class Main {

	public static void main(String[] args) {
		Empleado regular1 = new RegularPersonaEmpleado("octavio", "fernandez", 10);
		Empleado regular2 = new RegularPersonaEmpleado("ezequiel", "escalante", 10);

		Empleado liderDeProyecto1 = new LiderDeProyectoPersonaEmpleado("manuel", "lopez", 20);
		liderDeProyecto1.agregarNuevo(regular1);
		liderDeProyecto1.agregarNuevo(regular2);

		Empleado liderDeProyecto2 = new LiderDeProyectoPersonaEmpleado("italo", "ibanez", 20);
//		liderDeProyecto2.agregarNuevo(regular2);

		Empleado mandoMedio1 = new MandosMediosPersonaEmpleado("franco", "gomez", 30);
		mandoMedio1.agregarNuevo(liderDeProyecto1);
		mandoMedio1.agregarNuevo(liderDeProyecto2);

		Empleado gerente1 = new GerentePersonaEmpleado("fabiana", "tolosa", 40);
		gerente1.agregarNuevo(mandoMedio1);

		Empleado director1 = new DirectorPersonaEmpleado("HUAYQUIFIL", "HUAYQUIFIL", 50);
		director1.agregarNuevo(gerente1);

		ListaEmpleados listaEmpleadosEmpresa = new ListaEmpleados();
		listaEmpleadosEmpresa.agregar(director1);

		Empresa empresa = new Empresa("Mi Empresa", listaEmpleadosEmpresa);
		System.out.println("\nMASA SALARIAL: " + empresa.calcularMasaSalarial());
	}

}
