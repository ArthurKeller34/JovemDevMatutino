package Matrizes;

import java.util.Random;

public class ExemploMatriz1 {

	public static void main(String[] args) {

		int[][] matriz = new int[4][4];
		Random r = new Random();
		// primeira linha
		matriz[0][0] = r.nextInt(99);
		matriz[0][1] = r.nextInt(99);
		matriz[0][2] = r.nextInt(99);
		matriz[0][3] = r.nextInt(99);

		// segunda linha
		matriz[1][0] = r.nextInt(99);
		matriz[1][1] = r.nextInt(99);
		matriz[1][2] = r.nextInt(99);
		matriz[1][3] = r.nextInt(99);

		// terceira linha
		matriz[2][0] = r.nextInt(99);
		matriz[2][1] = r.nextInt(99);
		matriz[2][2] = r.nextInt(99);
		matriz[2][3] = r.nextInt(99);

		// quarta linha
		matriz[3][0] = r.nextInt(99);
		matriz[3][1] = r.nextInt(99);
		matriz[3][2] = r.nextInt(99);
		matriz[3][3] = r.nextInt(99);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " " );
				System.out.print("\nlinha: ");
			}
			
		}
		
	}
}
