package Ejercicios;


public class TestVideojuegos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guerreros g = new Guerreros("Cratos", 200, "Espada");
		Magos m = new Magos("Ares","Curacion");
		System.out.println("Personaje Guerrero "+g);
		System.out.println("Personaje Mago"+m);
		System.out.println("Guerrero combatir "+g.combatir(30));
		System.out.println("Personaje Guerrero "+g);
	}

}

