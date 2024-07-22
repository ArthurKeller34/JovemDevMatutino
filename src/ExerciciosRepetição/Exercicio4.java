package ExerciciosRepetição;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero inteiro: "));
		for (int i = n - 1; i >= 1; i--) {

			n *= i;
			System.out.println();
		}
		JOptionPane.showMessageDialog(null, n);

	}
}
