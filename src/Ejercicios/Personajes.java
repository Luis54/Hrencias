package Ejercicios;

public class Personajes {
	
	private String nombre;
	protected int nEnergia;
	
	public Personajes(String nombre,int nEnergia) {
		this.nombre = nombre;
		this.nEnergia = nEnergia;
	}
	public int alimentarse(int energia){
		return nEnergia = energia;
	}
	@Override
	public String toString() {
		return "nombre=" + nombre + " nEnergia=" + nEnergia;
	}
}
