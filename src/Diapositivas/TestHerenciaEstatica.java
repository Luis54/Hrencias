package Diapositivas;

public class TestHerenciaEstatica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor = EstaticaHija.getValor();
		System.out.println("valor: " +valor);
		valor = EstaticaPadre.getValor();
		System.out.println("Valor padre: "+valor);
	}

}
class EstaticaPadre{
	//protected me permite la visibiliada en la clases hijas
	protected static int valor = 0;
	public static int getValor(){
		return ++valor;
	}
}
class EstaticaHija extends EstaticaPadre{
	public static int getValor(){
		return valor+2;
	}
}