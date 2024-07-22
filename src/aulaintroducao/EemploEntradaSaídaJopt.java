package aulaintroducao;

import javax.swing.JOptionPane;

public class EemploEntradaSaídaJopt {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome: ");
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
		double imc = peso / (altura * altura);
		String msg = nome + "\n Seu IMC é: " + imc;
		JOptionPane.showMessageDialog(null, msg);
		
		
		
		
		
		
	}
	
	
	
	
}
