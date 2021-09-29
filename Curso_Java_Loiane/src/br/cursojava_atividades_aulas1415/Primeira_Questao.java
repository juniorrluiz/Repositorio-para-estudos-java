package br.cursojava_atividades_aulas1415;

import java.util.Scanner;

/*1. Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.*/

public class Primeira_Questao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		
		System.out.println("Insira dois numeros");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		
		if(num1 > num2 ) {
			System.out.println("O primeiro numero � maior");
		} else {
			System.out.println("O segundo numero � maior");
		}

		sc.close();
	}

}
