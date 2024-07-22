package EstruturaDeRepetição;

import javax.swing.JOptionPane;

public class ExemploEnquanto {

	public static void main(String[] args) {
		
		double vlOrcamento = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor voce tem para gastar?"));
		double vlGasto = 0;
		while (vlGasto <= vlOrcamento) {
			vlGasto += Double.parseDouble(JOptionPane.showInputDialog("Valor que gastou?"));
			
		} JOptionPane.showMessageDialog(null, "Voce nao pode mais gastar");
		
		
		
		
		
	}
}
