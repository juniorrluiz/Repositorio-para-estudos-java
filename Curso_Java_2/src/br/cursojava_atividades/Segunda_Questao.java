package br.cursojava_atividades;

import java.util.Scanner;

public class Segunda_Questao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		
		System.out.println("insira um numero");
		num = sc.nextDouble();
		
		if (num > 0) {
			System.out.println("o numero " + num + " � positivo");
			
		} else {
			System.out.println("o numero " + num + " � negativo");
		}
		sc.close();
	}

}
