package com.javaCompleto;

import java.util.Scanner;

public class AtividadeDoWhile {
	
	/* Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em
	Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o
	programa. */

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		char resp;
		do {
		System.out.print("Digite a temperatura em Celsius: ");
		double c = in.nextDouble();
		double f = 9.0 * c / 5.0 + 32.0;
		
		System.out.printf("Equivalente em Fahrenheit = %.1f%n", f);
		System.out.print("Deseja repetir (s/n)? ");
		resp = in.next().charAt(0);
		} while (resp != 'n');
		
		
		in.close();
		
		
		
	}
}