package aulaintroducao;

import javax.swing.JOptionPane;

public class ExercicioAreaTriangulo {

	
	public static void main(String[] args) {
		
		
		
		double base = Double.parseDouble(JOptionPane.showInputDialog("Base do triangulo: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura do triangulo: "));
			
			
		double areaTriangulo = (base * altura) / 2;
		 JOptionPane.showMessageDialog(null, areaTriangulo);
		
		
		
	}
	
	
	
	
	
}
