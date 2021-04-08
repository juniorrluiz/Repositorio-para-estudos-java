package br.cursojava_atividades;

import java.util.Scanner;

/*8. Faça um programa que pergunte o preço de três produtos e informe 
qual produto você deve comprar, sabendo que a decisão é sempre 
pelo mais barato.*/

public class Oitava_Questao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("insira o preço dos 3 produtos");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();

		if (num1 < num2 && num1 < num3) {
			System.out.println("O produto de valor R$ " + num1 + " é mais barato");
		}else if(num2 < num1 && num2 < num3) {
			System.out.println("O produto de valor R$ " + num2 + " é mais barato");
		}else {
			System.out.println("O produto de valor R$ " + num3 + " é mais barato");
		}
	

		sc.close();
	}

}
