package br.cursojava_atividades;

import java.util.Scanner;

public class Setima_Questao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("insira 3 numeros");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();

		if (num1 > num2 && num1 > num3 ) {
			System.out.println("o numero " + num1 + " é maior");
		} else if (num2 > num1 && num2 > num3){
			System.out.println("o numero " + num2 + " é maior");
		}else {
			System.out.println("o numero " + num3 + " é maior");
		}
		if (num1 < num2 && num1 < num3 ) {
			System.out.println("o numero " + num1 + " é menor");
		} else if (num2 < num1 && num2 < num3){
			System.out.println("o numero " + num2 + " é menor");
		}else {
			System.out.println("o numero " + num3 + " é menor");
		}
	

		sc.close();
	}

}
