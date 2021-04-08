package br.cursojava_atividades;

import java.util.Scanner;

public class Primeira_Questao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		
		System.out.println("Insira dois numeros");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		
		if(num1 > num2 ) {
			System.out.println("O primeiro numero é maior");
		} else {
			System.out.println("O segundo numero é maior");
		}

		sc.close();
	}

}
