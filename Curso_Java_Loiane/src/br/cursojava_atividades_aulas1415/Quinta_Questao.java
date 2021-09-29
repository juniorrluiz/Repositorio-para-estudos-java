package br.cursojava_atividades_aulas1415;

import java.util.Scanner;

/*5. Fa�a um programa para a leitura de duas notas parciais de um aluno. 
O programa deve calcular a m�dia alcan�ada por aluno e apresentar:
o A mensagem "Aprovado", se a m�dia alcan�ada for maior ou 
igual a sete;
o A mensagem "Reprovado", se a m�dia for menor do que sete;
o A mensagem "Aprovado com Distin��o", se a m�dia for igual a 
dez.*/

public class Quinta_Questao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira duas notas");
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;

		if(media >= 7) {
			System.out.println("Voce est� aprovado com: " + media + " pontos");
		}else if (media == 10) {
			System.out.println("Aprovado com distin��o");
		} else {
			System.out.println("Reprovado com: " + media + " pontos");
		}
		sc.close();
	}

}
