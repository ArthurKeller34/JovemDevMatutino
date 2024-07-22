package aulaintroducao;

import java.math.BigDecimal;

import javax.swing.JOptionPane;


public class ExercicioCalculoMedidas {

	public static void main(String[] args) {
		
		double pes = Double.parseDouble(JOptionPane.showInputDialog("insira a meida em pes: "));
		double milhas = pes / 5280;
		BigDecimal decimal = new BigDecimal(milhas);
			JOptionPane.showMessageDialog(null, "medida em polegadas: " + pes * 12);
			JOptionPane.showMessageDialog(null, "medida em jardas:" + pes / 3);
			JOptionPane.showMessageDialog(null, "medida em milhas:" + pes / 5280);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
	
	
}
