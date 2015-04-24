package Diapositivas;

import java.time.LocalDate;

public class TestVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche c = new Coche(7,true,false);
		Coche c2 = new Coche(4,false,true);
		c.setPropietario("Luis Usero");
		c2.setPropietario("Nerea bustos");
		Motocicleta m = new Motocicleta(250);
		Motocicleta m2 = new Motocicleta(500);
		m.setPropietario("Luis Garcia");
		m2.setPropietario("Juan Luis Reyes");
		System.out.println(c+"\n"+c2+"\n"+m+"\n"+m2+"\n");
	}

}
class Vehiculo{
	private int numeroRuedas;
	private LocalDate fechaCompra;
	private String propietario;
	private int numeroPasajeros;
	
	public Vehiculo(int numeroRuedas, int numeroPasajeros) {
		this.numeroRuedas = numeroRuedas;
		this.fechaCompra = LocalDate.now();
		this.numeroPasajeros = numeroPasajeros;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public LocalDate getFechaCompra() {
		return fechaCompra;
	}

	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}

	@Override
	public String toString() {
		return "[numeroRuedas=" + numeroRuedas + ", fechaCompra="
				+ fechaCompra + ", propietario=" + propietario
				+ ", numeroPasajeros=" + numeroPasajeros + "]";
	}
	
	
}
class Coche extends Vehiculo{
	private boolean diesel;
	private boolean descapotable;
	
	public Coche(int numeroPasajeros,boolean diesel, boolean descapotable) {
		super(4,numeroPasajeros);
		this.diesel = diesel;
		this.descapotable = descapotable;
	}

	@Override
	public String toString() {
		return "Coche [diesel=" + diesel + ", descapotable=" + descapotable
				+ ", VEHICULO" + super.toString() + "]";
	}
		
}
class Motocicleta extends Vehiculo{
	private int cilindrada;

	public Motocicleta(int cilindrada) {
		super(2,2);
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Motocicleta [cilindrada=" + cilindrada + ", toString()="
				+ super.toString() + "]";
	}
	
}