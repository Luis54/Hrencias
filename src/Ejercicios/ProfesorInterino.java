package Ejercicios;

public class ProfesorInterino extends Profesor {

	private int tiempoContrato;

	public ProfesorInterino(String nombre, int edad, String asignatura,
			int tiempoContrato) {
		super(nombre, edad, asignatura);
		this.tiempoContrato = tiempoContrato;
	}

	public int getTiempoContrato() {
		return tiempoContrato;
	}

	public void setTiempoContrato(int tiempoContrato) {
		this.tiempoContrato = tiempoContrato;
	}

	@Override
	public String toString() {
		return "ProfesorInterino [tiempoContrato=" + tiempoContrato
				+ " " + super.toString() + "]";
	}
	
}
