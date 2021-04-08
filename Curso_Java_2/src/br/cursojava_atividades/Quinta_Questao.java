package br.cursojava_atividades;

import java.util.Scanner;

public class Quinta_Questao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira duas notas");
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;

		if(media >= 7) {
			System.out.println("Voce está aprovado com: " + media + " pontos");
		}else if (media == 10) {
			System.out.println("Aprovado com distinção");
		} else {
			System.out.println("Reprovado com: " + media + " pontos");
		}
		sc.close();
	}

}
