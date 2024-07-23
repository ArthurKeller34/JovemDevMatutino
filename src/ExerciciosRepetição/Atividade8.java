package ExerciciosRepetição;

import javax.swing.JOptionPane;

public class Atividade8 {
	public static void main(String[] args) {

		double valorSaldo = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do seu saldo atual: "));
		String opcoes = """
				1 - doposito
				2 - retirada
				3 - sair
				""";
		int opcaoEscolhida = Integer.parseInt(JOptionPane.showInputDialog(opcoes));
		if (opcaoEscolhida == 1) {
			double valorDepositado = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do deposito? "));
			valorSaldo += valorDepositado;
			JOptionPane.showMessageDialog(null, "Seu novo saldo é: " + valorSaldo);
		} else if (opcaoEscolhida == 2) {
			double valorRetirado = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da retirada? "));
			valorSaldo -= valorRetirado;
			JOptionPane.showMessageDialog(null, "Seu novo saldo é: " + valorSaldo);
		} else {
			JOptionPane.showMessageDialog(null, "Até mais!");
		}

	}
}
