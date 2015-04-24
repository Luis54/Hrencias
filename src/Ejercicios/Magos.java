package Ejercicios;

public class Magos extends Personajes {
	
	private String poder;
	
	public Magos(String nombre, String poder) {
		super(nombre,100);
		this.poder = poder;
	}

	public String encantar(){
		nEnergia=nEnergia-2;
		return poder;
	}
	@Override
	public String toString() {
		return " Poder: " + encantar()+ " " + super.toString();
	}
}

