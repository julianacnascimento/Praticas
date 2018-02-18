package exercicios;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		String aux="";
		double area, base;
		BufferedReader bf;		
		try {
			
			System.out.println("Digite a base do triângulo retângulo: ");
			bf = new BufferedReader(new InputStreamReader(System.in));
			aux = bf.readLine();
			base = Double.parseDouble(aux);
			System.out.println("Digite a altura do triângulo retângulo: ");
			aux = bf.readLine();
			area = Double.parseDouble(aux);
			double calc = calculoAreaTriangulo(base, area);
			System.out.print("a área do triângulo retângulo é: ");
			imprime(calc);
			
			
		} catch (IOException erro){
			System.out.println("Erro na entrada de dados "+erro);
		} catch (NumberFormatException erro){
			System.out.println("Erro na conversão, digite apenas caracteres numéricos" + erro.toString());
		}
	}
	
	public static void imprime (double d){
		System.out.println(d);
	}
	
	public static double calculoAreaTriangulo(double x, double y){
		return (x*y)/2;
	}
	

}
