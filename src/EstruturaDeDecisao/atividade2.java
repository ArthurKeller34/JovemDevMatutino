package EstruturaDeDecisao;

import javax.swing.JOptionPane;

public class atividade2 {

	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero:"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero:"));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro numero:"));
		String msg = "";

		if (n1 >= n2 && n1 >= n3) {
			msg += n1;
			if (n2 >= n3) {
				msg += ", " + n2 + ", " + n3;
			} else {
				msg += ", " + n3 + ", " + n2;
			}
		} else if (n2 >= n3) {
			msg += n2;
			if (n1 >= n3) {
				msg += ", " + n1 + ", " + n3;
			} else {
				msg += ", " + n3 + ", " + n1;
			}
		} else {
			msg += n3;
			if (n1 >= n2) {
				msg += ", " + n1 + ", " + n2;
			} else {
				msg += ", " + n2 + ", " + n1;

			}
		
		}
		JOptionPane.showMessageDialog(null, msg);
	}

}
