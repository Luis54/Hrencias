package Diapositivas;

public class TestHerencia {
	public static void main(String[] args) {
		Hija h1 = new Hija();
		
	}
}
class Padre{
	
	public Padre(){
		System.out.println("Creado objeto de la clase Padre");
	}
}
class Hija extends Padre{
	
	public Hija(){
		super();
		System.out.println("Creado objeto de la clase Hija");
	}
}