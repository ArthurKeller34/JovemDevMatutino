package EstruturaDeRepetição;

import javax.swing.JOptionPane;

public class ExemploRepita {

	public static void main(String[] args) {

		double vlOrcamento = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor voce tem para gastar?"));
		double vlGasto = 0;

		do {
			vlGasto += Double.parseDouble(JOptionPane.showInputDialog("Valor que gastou?"));

		} while (vlGasto <= vlOrcamento);

		JOptionPane.showMessageDialog(null, "Voce nao pode mais gastar");

	}
}
