package EstruturaDeRepetição;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		
	//	for (int i = 0; i < 20; i+=2 ) {
	//		System.out.print(i + " ");
	//	}
		
		
		
		int pontoIn = Integer.parseInt(JOptionPane.showInputDialog("digite o ponto inicial"));
		int pontoFn = Integer.parseInt(JOptionPane.showInputDialog("digite o ponto final"));
		
		if ( pontoIn < pontoFn) {
			
			for ( int i = pontoIn; i<= pontoFn; i++) {
				
				System.out.print( i + " ");
			}
		} else {
		
			for ( int i = pontoIn; i >= pontoFn; i--) {
				
				System.out.print( i + " ");
			}
		
		
		
		}
		
	}
}
