package br.cursojava_atividades_aulas1415;

import java.util.Scanner;

/*6. Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.*/

public class Sexta_Questao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("insira 3 numeros");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();

		if (num1 > num2 && num1 > num3 ) {
			System.out.println("o numero " + num1 + " � maior");
		} else if (num2 > num1 && num2 > num3){
			System.out.println("o numero " + num2 + " � maior");
		}else {
			System.out.println("o numero " + num3 + " � maior");
		}

		sc.close();
	}

}
