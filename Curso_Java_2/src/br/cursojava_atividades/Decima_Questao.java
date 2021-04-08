package br.cursojava_atividades;

import java.util.Scanner;

public class Decima_Questao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("escreva o turno com: M-matutino ou V-Vespertino ou N- Noturno");
		String turno = sc.next();
		
		switch (turno) {
		case "M":
		case "m":	
			System.out.println("Bom dia!");
			break;
		case "V":
		case "v":	
			System.out.println("Boa tarde!");
			break;
		case "N":
		case "n":	
			System.out.println("Bom moite!");
			break;

		default: 
			System.out.println("Valor inválido");
			break;
		}
		
	

		sc.close();
	}

}
