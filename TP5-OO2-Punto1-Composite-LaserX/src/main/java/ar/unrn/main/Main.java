package ar.unrn.main;

import ar.unrn.domain.model.Empleado;
import ar.unrn.domain.model.Empresa;
import ar.unrn.domain.model.LiderDeProyectoEmpleado;
import ar.unrn.domain.model.Persona;
import ar.unrn.domain.model.RegularesEmpleado;

public class Main {

	public static void main(String[] args) {
		Empleado regular1 = new RegularesEmpleado(new Persona("Rodrigo", "Huayquifil", 10));
		Empleado regular2 = new RegularesEmpleado(new Persona("Ezequiel", "Huayquifil", 10));

		Empleado liderDeProyecto1 = new LiderDeProyectoEmpleado(new Persona("Manu", "Ibanez", 20));
		liderDeProyecto1.agregarNuevo(regular1);
		liderDeProyecto1.agregarNuevo(regular2);
//
//		Empleado liderDeProyecto2 = new LiderDeProyecto("Italo", "Ibanez", 20);
////		liderDeProyecto2.agregarNuevo(regular2);
//
//		Empleado mandoMedio1 = new MandosMediosEmpleado("Franco", "Huayquifil", 30);
//		mandoMedio1.agregarNuevo(liderDeProyecto1);
//		mandoMedio1.agregarNuevo(liderDeProyecto2);
//
//		Empleado gerente1 = new GerenteEmpleado("Fabiana", "Huayquifil", 40);
//		gerente1.agregarNuevo(mandoMedio1);
//
//		Empleado director1 = new DirectorEmpleado("HUAYQUIFIL", "HUAYQUIFIL", 50);
//		director1.agregarNuevo(gerente1);
//
////		liderDeProyecto1.info();
		Empresa empresa = new Empresa("Mi Empresa", liderDeProyecto1);
		liderDeProyecto1.info();
		System.out.println(empresa.calcularMasaSalarial());
	}

}
