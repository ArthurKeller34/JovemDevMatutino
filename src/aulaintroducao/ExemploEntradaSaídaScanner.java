package aulaintroducao;

import java.util.Scanner;

public class ExemploEntradaSaídaScanner {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
			System.out.println("Nome: ");
				String nome = sc.next();

			System.out.println("Altura: ");
		        double altura = sc.nextDouble();

			System.out.println("Peso: ");
				double peso = sc.nextDouble();
				
	sc.close();
	
	double imc = peso / (altura * altura);
	
	
	System.out.println("Nome: "+ nome + "\nSeu imc é:" + imc);
	
	
	
		

	}

}