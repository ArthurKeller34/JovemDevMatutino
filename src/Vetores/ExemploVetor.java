package Vetores;

import javax.swing.JOptionPane;

public class ExemploVetor {

	public static void main(String[] args) {
		
		int[] idades = new int [100];
		String[] nomes  = new String[100];
		String menu = """
				1 - cadastrar
				2 nome da pessoas mais velha
				3- buscar pessoa
				4 - SA0IR
				""";
		int op = 0;
		do {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1: 
			if ( qt < 100) {
				nomes [qt] = JOptionPane.showInputDialog("Nome " )
				
				
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + op);
			}
		}
	}
}
