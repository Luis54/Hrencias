package Ejercicios;

public class Programador extends InformaticosAbs{
	public String lenguaje;

	public Programador(String empresa, String lenguaje) {
		super(empresa);
		this.lenguaje = lenguaje;
		
	}
	
	public  double pagarSueldo(double horas){
		return getSueldo()*horas;
	}
	
	/*public  double pagarSueldo2(double horas){
		return super.pagarSueldo(horas);
	}*/

	@Override
	public String toString() {
		return "Programador [lenguaje=" + lenguaje + ","
				+ super.toString() + "]";
	}

	
	
}
