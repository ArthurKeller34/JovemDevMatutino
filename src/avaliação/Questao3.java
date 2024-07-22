package avaliação;

import javax.swing.JOptionPane;

public class Questao3 {

	public static void main(String[] args) {

		double velocidadeNet = Double
				.parseDouble(JOptionPane.showInputDialog("Qual a velocidade da sua internet em mb/s? "));
		double tamanhoArq = Double
				.parseDouble(JOptionPane.showInputDialog("Qual o tamanho do arquivo em mb que deseja baixar? "));

		double velocidadeDownl = tamanhoArq / velocidadeNet;

		if (velocidadeDownl < 60) {

			JOptionPane.showMessageDialog(null,
					"O tempo necessario para baixar o arquivo é de: " + velocidadeDownl + " segundos.");
		} else if (velocidadeDownl == 60) {

			JOptionPane.showMessageDialog(null, "O tempo necessario para baixar o arquivo é de 1 minuto.");

		} else {

			double tempoDownl = tamanhoArq / velocidadeNet;
			JOptionPane.showMessageDialog(null,
					"O tempo necessario para baixar o arquivo é de: " + tempoDownl + " minuto(s).");
		}

	}

}
