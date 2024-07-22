package avaliação;

import javax.swing.JOptionPane;

public class Questao4 {

	public static void main(String[] args) {

		double precoGasolina = Double
				.parseDouble(JOptionPane.showInputDialog("Qual o valor do litro da gasolina hoje?"));
		double precoAlcool = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do litro do álcool hoje?"));
		double diferencaPreco = (100 * precoGasolina / precoAlcool);

		if (diferencaPreco < 30) {
			JOptionPane.showMessageDialog(null, "A gasolina é mais vantajosa");

		} else if (diferencaPreco == 30) {
			JOptionPane.showMessageDialog(null, "Os dois tem o mesmo custo beneficio");

		} else {

			JOptionPane.showMessageDialog(null, "O álcool é mais vantajoso");
		}

	}
}
