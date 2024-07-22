package EstruturaDeDecisao;

import javax.swing.JOptionPane;

public class atividade5 {

	public static void main(String[] args) {
		
		char letra = JOptionPane.showInputDialog("Insira a letra: ").charAt(0);
		
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
			JOptionPane.showMessageDialog(null, "Aletra é uma vogal");
		else {
			JOptionPane.showMessageDialog(null, "A letra não é uma vogal");
			
		}
			
			
		}
		
		
		
		
		
	}
	
	
	
	

