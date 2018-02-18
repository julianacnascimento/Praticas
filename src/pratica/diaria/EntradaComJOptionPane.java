package exercicios;
import javax.swing.*;

public class EntradaComJOptionPane {

	public static void main(String[] args) {
		String aux = "";
		float nota1, nota2, nota3, media = 0;
		try {
			aux = JOptionPane.showInputDialog("Digite a nota 1");
			nota1 = Float.parseFloat(aux);
			
			aux = JOptionPane.showInputDialog("Digite a nota 2");
			nota2 = Float.parseFloat(aux);
			
			aux = JOptionPane.showInputDialog("Digite a nota 3");
			nota3 = Float.parseFloat(aux);
			
			media = (nota1 + nota2 + nota3)/3;
			JOptionPane.showMessageDialog(null, "Media: "+media);
			
		}catch (NumberFormatException erro){
			System.out.println("Houve erro na conversão, digite apenas caracteres numericos"
					+ erro.toString());
		}

	}

}
