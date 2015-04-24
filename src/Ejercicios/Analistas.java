package Ejercicios;

public class Analistas extends InformaticosAbs{
	public String especialidad;

	public Analistas(String empresa, String especialidad) {
		super(empresa);
		this.especialidad = especialidad;
	}
	
	public double pagarSueldo(double horas){
		return getSueldo()*horas;
	}
	

	@Override
	public String toString() {
		return "Analistas [especialidad=" + especialidad + ","
				+ super.toString() + "]";
	}
	
}
