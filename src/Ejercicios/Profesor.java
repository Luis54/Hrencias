package Ejercicios;

public class Profesor extends Persona {
	private String asignatura;

	public Profesor(String nombre, int edad, String asignatura) {
		super(nombre, edad);
		this.asignatura = asignatura;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		return "Profesor [asignatura=" + asignatura + " "
				+ super.toString() + "]";
	}
	
	
}
