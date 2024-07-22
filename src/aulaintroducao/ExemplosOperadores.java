package aulaintroducao;

import java.awt.SystemColor;

public class ExemplosOperadores {

	public static void main(String[] args) {

		int int1 = 10;
		int int2 = -5;
		int int3 = 3;

		double double1 = 2.5;
		double double2 = -5.0;
		double double3 = 3.3;

		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;

		// SOMA

		int r1 = (int1 + int2);

		double r2 = (double1 + double3);

			System.out.println("Soma de dois inteiros = " + r1);
			System.out.println("Soma de dois doubles = " + r2);

		// subtração
		int r3 = (int3 - int1);

			System.out.println("Subtração de inteiros = " + r3);

		// multiplicação
		int r4 = (int1 * int3);

			System.out.println("Multiplicação de inteiros = " + r4);

		// divisão
		double r5 = (int1 / int3);

		r5 = (double) int1 / int3;
			System.out.println("Divisão de inteiros = " + r5);

		// OPERAÇÕES RELACIONAIS

			System.out.println(" 10 é igual a 5? " + (10 == 5));
		;
			System.out.println(" 10 é diferente a 5? " + (10 != 5));
			System.out.println(" 10 é maior que a 5? " + (10 > 5));
			
		boolean r10 = int3 > int1;
			System.out.println(" int3 é maior que int1? " + r10);

		// OPERAÇÕES LÓGICAS

			System.out.println("Operação AND: " + (b1 && b2 && b3));
			System.out.println("Operação OR: " + (b1 || b2 || b3));
			System.out.println("Negação b1: " + (b1));

		// Operações String

			String str1 = "CASA";
			String str2 = "ESCOLA";
			String str3 = " ";
			String str4 = "10";

		char c1 = 'A';
		char c2 = '5';
		char c3 = ' ';

			System.out.println(str1 + str2);
			System.out.println(str1 + double1);
			System.out.println("Casa é igual a casa?" + (str1 == str2));
			System.out.println("Casa é igual a casa?" + (str1.equalsIgnoreCase(str2)));
			System.out.println(str2.substring(2));
			System.out.println(str2.substring(2, 4));
			System.out.println(str2.substring(2, 4));

	}

}
