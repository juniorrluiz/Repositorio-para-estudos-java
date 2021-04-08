package br.cursojava_atividades;

import java.util.Scanner;

public class Quarta_Questao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String letra;

		System.out.println("Entre com uma letra");
		letra = sc.next();

		if (letra.length() > 1) {
			System.out.println("Informação invalida, tente novamente");
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
				System.out.println("letra " + letra + " é vogal");
				break;

			default: System.out.println("letra " + letra + " é consoante");
			break;
			}
		}
		sc.close();
	}

}
