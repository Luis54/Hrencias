package Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class ListinProfesores{

	private List<Profesor> listaProfesores;


	
	public ListinProfesores() {
		listaProfesores = new ArrayList<Profesor>();
	}

	

	public List<Profesor> getListaProfesores() {
		return listaProfesores;
	}



	public void setListaProfesores(List<Profesor> listaProfesores) {
		this.listaProfesores = listaProfesores;
	}



	public void insertarProfesores(Profesor p){
		listaProfesores.add(p);
	}
}
