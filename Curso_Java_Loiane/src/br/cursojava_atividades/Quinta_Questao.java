package br.cursojava_atividades;

import java.util.Scanner;

/*5. Faça um programa para a leitura de duas notas parciais de um aluno. 
O programa deve calcular a média alcançada por aluno e apresentar:
o A mensagem "Aprovado", se a média alcançada for maior ou 
igual a sete;
o A mensagem "Reprovado", se a média for menor do que sete;
o A mensagem "Aprovado com Distinção", se a média for igual a 
dez.*/

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
