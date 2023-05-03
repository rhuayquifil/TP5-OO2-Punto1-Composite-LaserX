package ar.unrn.domain.model;

public abstract class PersonaEmpleado implements Empleado {

	private String nombre;
	private String apellido;
	private double sueldo;
	private ListaEmpleados listaEmpleadoACargo;
//	private List<Empleado> listaEmpleadoACargo;

	public PersonaEmpleado(String nombre, String apellido, double sueldo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldo = sueldo;
		this.listaEmpleadoACargo = new ListaEmpleados();
	}

	public void agregarNuevo(Empleado empleado) {
		this.listaEmpleadoACargo.agregar(empleado);
	}

	public double calcularMasaSalarial() {
		return this.sueldo + listaEmpleadoACargo.calcularMasaSalarial();
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
