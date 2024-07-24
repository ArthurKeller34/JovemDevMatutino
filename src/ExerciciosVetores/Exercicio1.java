package ExerciciosVetores;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
		String menuInicial = """
				1 - cadastrar mercadoria (NO MÁXIMO 50 MERCADORIAS)
				2 - quantas mercadorias  tem menos que 10 unidades no estoque
				3 - Quantas mercadorias custam mais de 100 reais e tem estoque com mais de 10 unidades
				4 - Qual o preço da mercadoria que tem o menor estoque
				5 - Qual o estoque da mercadoria com maior preço
				6 - Percentual das mercadorias que estão com o estoque zerado
				7 - Sair
				""" ;
		String menuRegistro = """
				1 - carrinho
				2 - boneca 
				3 - bola
				4 - lego
				5 - video game
				6 - voltar
				""";
		double[] valorMercadorias = new double[50];
		int[] qtMercadorias = new int[50];
		int opEscolhidaIn = Integer.parseInt(JOptionPane.showInputDialog(menuInicial));
		int opEscolhidaReg = Integer.parseInt(JOptionPane.showInputDialog(menuRegistro));
		
		switch (opEscolhidaIn) {
		case 1: 
			switch (opEscolhidaReg) {
			case 1: 
				int qtCarrinho = Integer.parseInt(JOptionPane.showInputDialog("Quantos carrinhos deseja adicionar ao estoque? "));
				break;
			case 2:  
				int qtBoneca = Integer.parseInt(JOptionPane.showInputDialog("Quantas bonecas deseja adicionar ao estoque? "));
				break;
			case 3:
				int qtBola = Integer.parseInt(JOptionPane.showInputDialog("Quantas bolas deseja adicionar ao estoque? "));
				break;
			case 4: 
			    int qtLego = Integer.parseInt(JOptionPane.showInputDialog("Quantos legos deseja adicionar ao estoque? "));
			    break;
		    case 5: 
				int qtVideoGame = Integer.parseInt(JOptionPane.showInputDialog("Quantos Video Games deseja adicionar ao estoque? "));
				break;
		    case 6:
				JOptionPane.showInputDialog(menuInicial);
			}
			
		//case 2:
		}//default:throw new IllegalArgumentException("Unexpected value: "+opEscolhida);
	}
}
