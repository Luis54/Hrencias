package Ejercicios;

public class Guerreros extends Personajes {

	private String arma;

	public Guerreros(String nombre, int nEnergia, String arma) {
		super(nombre, nEnergia);
		this.arma = arma;
		
	}

	public String combatir(int energiaCombatir){
		nEnergia=nEnergia-energiaCombatir;
		return arma+energiaCombatir;
	}

	@Override
	public String toString() {
		return "arma=" + arma + " " + super.toString();
	}
}
