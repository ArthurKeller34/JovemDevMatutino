package avaliação;

import javax.swing.JOptionPane;

public class Questao5 {

	public static void main(String[] args) {

		double valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da sua compra?"));
		double quantParcelas = Integer.parseInt(JOptionPane.showInputDialog("Em quantas parcelas deseja pagar?"));

		if (quantParcelas == 1) {

			double valorParcelas = ((valorCompra * 10) / 100);
			valorCompra -= valorParcelas;
			JOptionPane.showMessageDialog(null, "O valor da compra é de: " + valorCompra);
		} else if (quantParcelas > 1 && quantParcelas <= 3) {

			double valorParcelas = valorCompra / quantParcelas;
			JOptionPane.showMessageDialog(null, "O valor de cada parcela é de: " + valorParcelas);
		} else {

			valorCompra = ((valorCompra * 15) / 100) + valorCompra;
			double valorParcelas = valorCompra / quantParcelas;
			JOptionPane.showMessageDialog(null, "O valor de cada parcela é de: " + valorParcelas);

		}

	}
}
