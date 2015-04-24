package Ejercicios;

public class ProfesorTitular extends Profesor {
	private int añoExpreriencia;

	public ProfesorTitular(String nombre, int edad, String asignatura,
			int añoExpreriencia) {
		super(nombre, edad, asignatura);
		this.añoExpreriencia = añoExpreriencia;
	}

	public int getAñoExpreriencia() {
		return añoExpreriencia;
	}

	public void setAñoExpreriencia(int añoExpreriencia) {
		this.añoExpreriencia = añoExpreriencia;
	}

	@Override
	public String toString() {
		return "ProfesorTitular [añoExpreriencia=" + añoExpreriencia
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
