package exercicios;
import java.util.Scanner;

public class EntradaComScanner {

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, media = 0;
		try{
			
			System.out.println("Digite a nota 1: ");
			Scanner sc = new Scanner(System.in);
			nota1 = sc.nextFloat();
			
			System.out.println("Digite a nota 2: ");
			sc = new Scanner(System.in);
			nota2 = sc.nextFloat();
			
			System.out.println("Digite a nota 3: ");
			sc = new Scanner(System.in);
			nota3 = sc.nextFloat();
			
			media = (nota1 + nota2 + nota3)/3;
			System.out.println("Média: "+media);
			
		}catch (NumberFormatException erro){
			System.out.println("Houve erro na conversão, digite apenas caracteres numericos"
					+ erro.toString());
		}

	}

}
