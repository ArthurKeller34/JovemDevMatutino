package Matrizes;

import javax.swing.JOptionPane;

public class ExercicioMatriz {

	public static void main(String[] args) {

		String menuInicial = """
				1 - cadastro de aluno ( nome e nota )
				2 - lista de alunos
				3 - buscar aluno
				4 - alunos aprovados
				5 - alunos em recuperação
				6 - alunos reprovados
				7 - sair
				""";

		int op = Integer.parseInt(JOptionPane.showInputDialog(menuInicial));

		switch (op) {
		case 1:
			int qtAluno = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos deseja cadastrar? "));
			String nomeCadastro = JOptionPane.showInputDialog("qual o nome do aluno que deseja cadastrar? ");
			int qtProva = Integer.parseInt(JOptionPane.showInputDialog("quantas notas o aluno tem? "));
			double notasCadastro = Double
					.parseDouble(JOptionPane.showInputDialog("quais as notas do aluno que deseja cadastrar? "));
			int[] provas = new int[qtProva];
			String[] nomes = new String[qtAluno];

			int[][] cadastro = new int[qtProva][qtAluno];
			for (int i = 0; qtProva < provas.length; i++) {
				double notasAluno = Double
						.parseDouble(JOptionPane.showInputDialog("quais as notas do aluno que deseja cadastrar? "));
				
					{
						for (int j = 0; j < qtAluno; j++) {
							
					}
				}
			}

		case 2:

		default:
			throw new IllegalArgumentException("Unexpected value: " + op);
		}

	}
}
