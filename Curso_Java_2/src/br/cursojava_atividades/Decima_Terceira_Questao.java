package br.cursojava_atividades;

import java.util.Scanner;


/*13.Fa�a um Programa que leia um n�mero e exiba o dia correspondente 
da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve 
aparecer valor inv�lido.*/


public class Decima_Terceira_Questao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n Insira o dia da semana para: "
				+ "\n (1) Domingo, (2) Segunda,"
				+ "(3) Ter�a (4) Quarta, (5) Quinta,"
				+ "(6) Sexta e (7) Sabado ");

		int diaSemana = sc.nextInt();
		boolean valida = false;

		do {

			switch (diaSemana) {
			case 1:
				System.out.println("Domingo");
				valida = true;
				break;
			case 2:
				System.out.println("Segunda");
				valida = true;
				break;
			case 3:
				System.out.println("Ter�a");
				valida = true;
				break;
			case 4:
				System.out.println("Quarta");
				valida = true;
				break;
			case 5:
				System.out.println("Quinta");
				valida = true;
				break;
			case 6:
				System.out.println("Sexta");
				valida = true;
				break;
			case 7:
				System.out.println("S�bado");
				valida = true;
				break;
			default:
				System.out.println("Op��o invalida, tente novamente");
				diaSemana = sc.nextInt();
				valida = false;

				break;
			} 

		} while(!valida);



		/*do {





			if (diaSemana == 1) {
				System.out.println("Domingo");
				valida = true;

			} else if (diaSemana == 2) {
				System.out.println("Segunda");
				valida = true;

			} else if (diaSemana == 3) {
				System.out.println("Ter�a");
				valida = true;

			} else if (diaSemana == 4) {
				System.out.println("Quarta");
				valida = true;

			} else if (diaSemana == 5) {
				System.out.println("Quinta");
				valida = true;

			} else if (diaSemana == 6) {
				System.out.println("Sexta");
				valida = true;

			} else if (diaSemana == 7) {
				System.out.println("S�bado");
				valida = true;

			} else {
				System.out.println("Op��o inv�lida, tente novamente");
				valida = false;
			}

		} while (!valida);


		valida = true;
		 */

	} 

}


