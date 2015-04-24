package Ejercicios;

public class PruebaInformaticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Analistas a1 = new Analistas("Microsoft", "Finanzas");
		Programador p1 = new Programador("King", "Java");
		a1.setSueldo(10);
		p1.setSueldo(9);
		System.out.println(a1+ "Ganaria de sueldo: "+a1.pagarSueldo(100));
		System.out.println(p1+ "Ganaria de sueldo: "+p1.pagarSueldo(200));
		
	}

}
