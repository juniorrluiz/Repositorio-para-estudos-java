package br.cursojava_atividades;

import java.util.Scanner;


/*13.Fa�a um Programa que leia um n�mero e exiba o dia correspondente 
da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve 
aparecer valor inv�lido.*/


public class Decima_Terceira_Questao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o dia da semana para: "
				+ "\n (1) Domingo, (2) Segunda,"
				+ "(3) Ter�a (4) Quarta, (5) Quinta,"
				+ "(6) Sexta e (7) Sabado ");
		
		int diaSemana = sc.nextInt();
		
		switch (diaSemana) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Ter�a");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("S�bado");
			break;

		default:
			System.out.println("Op��o invalida");
			break;
		}
		


		sc.close();
	}

}
