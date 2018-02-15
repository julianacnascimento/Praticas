package pratica.diaria;

public class MeuPrograma {
	
	public static void main (String [] args) {
		double fatorial = calculaFatorial(4);
		imprime (fatorial);
		}
	public static void imprime (String s) {
		System.out.println(s);
	}
	public static void imprime (double d) {
		System.out.println(d);
	}
	public static double calculaFatorial (double f) {
		for(double i = f; i > 0; i--) {
			f = f*(i *(i-1));
			System.out.println(f);
		}return f;
	}
}
