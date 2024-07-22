package avaliação;

import javax.swing.JOptionPane;

public class Questao1 {

	public static void main(String[] args) {
		double nA = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de a"));
		double nB = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de b"));
		double nC = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de c"));

		double delta = (nB * nB) - 4 * nA * nC;
		double x1 = -nB + delta / 2 * nA;
		double x2 = +nB - delta / 2 * nA;

		JOptionPane.showMessageDialog(null, "O valor de x' é: " + x1);
		JOptionPane.showMessageDialog(null, "O valor de x'' é: " + x2);

	}

}
