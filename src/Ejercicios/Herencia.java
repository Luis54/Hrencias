package Ejercicios;

public class Herencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profesor p1 = new Profesor("Luis",31,"Programacion");
		Profesor p2 = new Profesor("Pedro",30,"Entorno");
		Profesor p3 = new Profesor("Juan",21,"Lenguague");
		ProfesorTitular pt1 = new ProfesorTitular("Paco",21,"Entorno",3);
		ProfesorInterino pI1 = new ProfesorInterino("Antonio",35,"Ssitemas",5);
		ListinProfesores lista = new ListinProfesores();
		lista.insertarProfesores(p1);lista.insertarProfesores(p2);
		lista.insertarProfesores(p3);lista.insertarProfesores(pI1);
		lista.insertarProfesores(pt1);
		System.out.println(lista);
		
	}

}
