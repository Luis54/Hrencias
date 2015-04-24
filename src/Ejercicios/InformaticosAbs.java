package Ejercicios;



public class InformaticosAbs {
	private String empresa;
	private double sueldo;
	
	public InformaticosAbs(String empresa) {
		this.empresa = empresa;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String nueva) {
		this.empresa = nueva;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double euros) {
		this.sueldo = euros;
	}
	public double pagarSueldo(double horas){
		return this.getSueldo()*horas;
	}

	@Override
	public String toString() {
		return "InformaticosAbs [empresa=" + empresa + ", sueldo=" + sueldo
				+ " €]";
	}
	
	
}
