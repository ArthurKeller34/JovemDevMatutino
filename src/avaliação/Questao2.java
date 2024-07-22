package avaliação;

import javax.swing.JOptionPane;

public class Questao2 {

	public static void main(String[] args) {

		double valorReal = Double
				.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de dinheiro em reais: "));
		double valorCotacao = Double.parseDouble(JOptionPane.showInputDialog("Insira a cotação atual do dólar: "));
		double valorDolar = valorReal / valorCotacao;

		JOptionPane.showMessageDialog(null, "O valor em reais que foi convertido para dólar : " + valorDolar);

	}

}
