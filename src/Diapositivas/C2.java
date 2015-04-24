package Diapositivas;

public class C2 {
	public static void main(String[] args) {
		C1 o = new C1();
		int suma = o.x + o.y + o.z; //o.u; //no acccesible a o.u variable privado
		o.m(); //accesible al ser protected
	}
}
