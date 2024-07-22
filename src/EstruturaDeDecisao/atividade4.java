package EstruturaDeDecisao;

import javax.swing.JOptionPane;

public class atividade4 {
	public static void main(String[] args) {
		double reta1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro segmento de reta:"));
		double reta2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo segmento de reta:"));
		double reta3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro segmento de reta:"));
		if ((reta1 + reta2 > reta3) && (reta1 + reta3 > reta2) && (reta2 + reta3 > reta1)) {
			if ((reta1 == reta2) && (reta2 == reta3)) {
				JOptionPane.showMessageDialog(null, "O triangulo é um equilátero");
			} else if ((reta1 != reta2) && (reta2 != reta3)) {
				JOptionPane.showMessageDialog(null, "O triangulo é um escaleno");
			} else {
				JOptionPane.showMessageDialog(null, "O triangulo é um isósceles");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Não é um triangulo");
		}
	}
	
}
