package Ejercicios;

public class Analistas extends InformaticosAbs{
	public String especialidad;

	public Analistas(String empresa, String especialidad) {
		super(empresa);
		this.especialidad = especialidad;
	}
	
	

	@Override
	public double pagarSueldo(double horas) {
		// TODO Auto-generated method stub
		return super.pagarSueldo(horas);
	}



	@Override
	public String toString() {
		return "Analistas [especialidad=" + especialidad + ","
				+ super.toString() + "]";
	}
	
}
