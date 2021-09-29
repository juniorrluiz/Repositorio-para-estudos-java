package br.cursojava_atividades_aulas1415;

import java.util.Scanner;

/*4. Fa�a um Programa que verifique se uma letra digitada � vogal ou 
consoante.*/

public class Quarta_Questao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String letra;

		System.out.println("Entre com uma letra");
		letra = sc.next();

		if (letra.length() > 1) {
			System.out.println("Informa��o invalida, tente novamente");
		}else {
			switch (letra) {
			case "a":
			case "A":
			case "e":
			case "E":
			case "i":
			case "I":
			case "o":
			case "O":
			case "u":
			case "U":
				System.out.println("letra " + letra + " � vogal");
				break;

			default: System.out.println("letra " + letra + " � consoante");
			break;
			}
		}
		sc.close();
	}

}
