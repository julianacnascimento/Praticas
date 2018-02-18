package exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaComBufferedReader {

	public static void main(String[] args) {
		
		String s = "";
		float nota1, nota2, nota3, media = 0;
		BufferedReader bf;
		try{
			System.out.println("Digite a nota 1: ");
			bf = new BufferedReader(new InputStreamReader(System.in));
			s = bf.readLine();
			nota1 = Float.parseFloat(s);
			
			System.out.println("Digite a nota 2: ");
			bf = new BufferedReader(new InputStreamReader(System.in));
			s = bf.readLine();
			nota2 = Float.parseFloat(s);

			System.out.println("Digite a nota 3: ");
			bf = new BufferedReader(new InputStreamReader(System.in));
			s = bf.readLine();
			nota3 = Float.parseFloat(s);
			
		

		}catch (IOException erro){
			System.out.println("Erro na entrada de dados "+erro.toString());
		}catch (NumberFormatException erro){
			System.out.println("Erro na conversão, digite apenas caracteres numéricos" + erro.toString());
		}
	}

}
