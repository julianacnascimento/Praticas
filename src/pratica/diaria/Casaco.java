package pratica.diaria;
import java.util.Scanner;

public class Casaco {
	
	public static void main (String [] args) {
			
		String t;
		
		System.out.println("Deseja iniciar o treino? [y/n]");
		Scanner sc = new Scanner (System.in);
		t = sc.nextLine();		
		
		boolean casaco = true;
		
		while (t.equals("y")) {
			
			for (int i=0; i<10; i++) {
				
				if (casaco == true) {
					System.out.println("Tira casaco!");
					casaco = false;
				}else  {
					System.out.println("Bota casaco!");
					casaco = true;
				}
				if (i == 9) {
					System.out.println("Deseja continuar o treino? [y/n]");
					t = sc.nextLine();
					i = 0;
					if ( t!= "y") {
						System.out.println("Obrigada!");
						break;
					}
				}
			}
		}
		
	}
}
