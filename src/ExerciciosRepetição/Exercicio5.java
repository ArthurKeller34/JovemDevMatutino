package ExerciciosRepetição;


public class Exercicio5 {

	public static void main(String[] args) {

		int resultado = 1;
		
		for (int i = 2; i < 101; i++) {
			if (i % 2 == 0) {
				resultado -= i;
			
				
			} else {
				
				resultado += i;
				

			} System.out.println(resultado);

		}

	}
}
