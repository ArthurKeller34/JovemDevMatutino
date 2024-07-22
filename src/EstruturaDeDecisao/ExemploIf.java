package EstruturaDeDecisao;

import javax.swing.JOptionPane;

public class ExemploIf {

	public static void main(String[] args) {
		int idadeJoaozinho = Integer.parseInt (JOptionPane.showInputDialog("Insira a idade do Joazinho: "));
		int idadeMariazinha = Integer.parseInt (JOptionPane.showInputDialog("Insira a idade do Mariazinha: "));
		
		
		// IF SIMPLES 
		
		if (idadeJoaozinho > idadeMariazinha) {
			JOptionPane.showMessageDialog(null, "Joaozinho é mais velho que Mariazinha");
			
		}else if (idadeJoaozinho == idadeMariazinha){
			JOptionPane.showMessageDialog(null, "Os dois tem a memsa idade");
			
		}else {
			JOptionPane.showMessageDialog(null, "Joaozinho é mais novo que Mariazinha");
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
