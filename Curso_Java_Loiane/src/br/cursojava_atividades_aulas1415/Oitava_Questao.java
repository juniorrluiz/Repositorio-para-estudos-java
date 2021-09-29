package br.cursojava_atividades_aulas1415;

import java.util.Scanner;

/*8. Fa�a um programa que pergunte o pre�o de tr�s produtos e informe 
qual produto voc� deve comprar, sabendo que a decis�o � sempre 
pelo mais barato.*/

public class Oitava_Questao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("insira o pre�o dos 3 produtos");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();

		if (num1 < num2 && num1 < num3) {
			System.out.println("O produto de valor R$ " + num1 + " � mais barato");
		}else if(num2 < num1 && num2 < num3) {
			System.out.println("O produto de valor R$ " + num2 + " � mais barato");
		}else {
			System.out.println("O produto de valor R$ " + num3 + " � mais barato");
		}
	

		sc.close();
	}

}
