package br.cursojava_atividades;

import java.util.Scanner;

/*2. Faça um Programa que peça um valor e mostre na tela se o valor é 
positivo ou negativo.*/

public class Segunda_Questao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		
		System.out.println("insira um numero");
		num = sc.nextDouble();
		
		if (num > 0) {
			System.out.println("o numero " + num + " é positivo");
			
		} else {
			System.out.println("o numero " + num + " é negativo");
		}
		sc.close();
	}

}
