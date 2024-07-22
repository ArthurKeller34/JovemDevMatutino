package EstruturaDeRepetição;

import javax.swing.JOptionPane;

public class ExemploMenu {

	public static void main(String[] args) {
		
		String menu = """
				1 - risoto de funghi
				2 - tiramisu
				3 - lasanha
				4 - file de salmao
				5 - pao de forma
				6 - fechar pedido
				""";
		String pedido = " ";
		
		int op = 6;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1: {
				pedido += "risoto de funghi\n";
				break;
			}case 2: {
				pedido += "tiramisu\n";
				break;
			}case 3: {
				pedido += "lasanha\n";
				break;
			}case 4: {
				pedido += "file de salmao\n";
				break;
			}case 5: {
				pedido += "pao de forma\n";
				break;
			}
			
			default:
				JOptionPane.showMessageDialog(null, "PARA DE SER BURRO!!!");
				break;
			}
			
			
			
		} while ( op != 6 );
		JOptionPane.showMessageDialog(null, "pedido: \n" + pedido);
		
		
		
		
		
	}
}
