package Ejercicios;

public class TestHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profesor p = new Profesor("Luis", 35, "Programacion");
		ProfesorInterino pI = new ProfesorInterino("Juan", 25, "Lenguague", 5);
		ProfesorTitular pT = new ProfesorTitular("Pedro", 40, "Fol", 6);
		ListinProfesores lista = new ListinProfesores();
		lista.insertarProfesores(p);lista.insertarProfesores(pT);
		lista.insertarProfesores(pI);
		for (Profesor profesor : lista.getListaProfesores()) {
			System.out.println(profesor);
			
		}
	}

}
