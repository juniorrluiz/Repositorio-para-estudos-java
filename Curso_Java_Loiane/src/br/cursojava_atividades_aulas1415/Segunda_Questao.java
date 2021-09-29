package br.cursojava_atividades_aulas1415;

import java.util.Scanner;

/*2. Fa�a um Programa que pe�a um valor e mostre na tela se o valor � 
positivo ou negativo.*/

public class Segunda_Questao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		
		System.out.println("insira um numero");
		num = sc.nextDouble();
		
		if (num > 0) {
			System.out.println("o numero " + num + " � positivo");
			
		} else {
			System.out.println("o numero " + num + " � negativo");
		}
		sc.close();
	}

}
