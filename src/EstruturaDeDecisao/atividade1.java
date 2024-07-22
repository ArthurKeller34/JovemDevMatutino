package EstruturaDeDecisao;

import javax.swing.JOptionPane;

public class atividade1 {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero:"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero:"));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro numero:"));
		
	if (n1 >= n2 && n1 >= n3 ){
        JOptionPane.showMessageDialog(null, "Maior numero:" + n1);		
		
	} else if ( n2 >= n3) {
		JOptionPane.showMessageDialog(null, "Maior numero: " + n2);
		
	} else {
		JOptionPane.showMessageDialog(null, "Maior numero: " + n3);
		 
	}
		
		
		
		
	}
	
	
	
	
}
