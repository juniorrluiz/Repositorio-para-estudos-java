package br.cursojava_atividades_aulas1415;

import java.util.Scanner;

/*10.Fa�a um Programa que pergunte em que turno voc� estuda. Pe�a 
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a 
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor 
Inv�lido!", conforme o caso.*/

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
			System.out.println("Valor inv�lido");
			break;
		}
		
	

		sc.close();
	}

}
