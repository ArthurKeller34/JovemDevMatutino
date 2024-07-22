package ExerciciosRepetição;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero: "));
		
		int valorElevado = a;
		for ( int i = 1; i < b; i++) { 
			valorElevado *= a;
		
		}
		
		JOptionPane.showMessageDialog(null, " o resultado é: " + valorElevado);
	
		}
		
		
		
		
		
		
	}


