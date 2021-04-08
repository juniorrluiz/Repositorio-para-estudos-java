package br.cursojava_atividades;

import java.util.Scanner;

/*10.Faça um Programa que pergunte em que turno você estuda. Peça 
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a 
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor 
Inválido!", conforme o caso.*/

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
