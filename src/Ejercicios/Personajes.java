package Ejercicios;

public class Personajes {
	
	private String nombre;
	protected int nEnergia;
	
	public Personajes(String nombre,int nEnergia) {
		this.nombre = nombre;
		this.nEnergia = nEnergia;
	}
	public void alimentarse(int energia){
		nEnergia+= energia;
	}
	
	public int getnEnergia() {
		return nEnergia;
	}
	@Override
	public String toString() {
		return "nombre=" + nombre + " nEnergia=" + nEnergia;
	}
}
