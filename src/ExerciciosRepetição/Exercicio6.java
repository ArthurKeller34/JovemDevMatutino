package ExerciciosRepetição;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		
		
		
		int qntdPessoas = Integer.parseInt(JOptionPane.showInputDialog("insira a quantidade de pessoas: "));
		String nome = JOptionPane.showInputDialog("insira seu nome: ");
		double idade = Double.parseDouble(JOptionPane.showInputDialog("Insira sua idade:" ));
		
		
		for ( int i = 0; i < qntdPessoas; i++) {
 
			double somatorio = idade + i;
			JOptionPane.showMessageDialog(null, somatorio);
		}
		
	}
}
