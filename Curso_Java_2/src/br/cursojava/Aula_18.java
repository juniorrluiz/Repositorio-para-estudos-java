package br.cursojava;

import java.util.Scanner;

public class Aula_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("Digite um numero");
		x = sc.nextInt();
		
		if(x < 0 || x > 100) {
			System.out.println("Numero invalido");
		} else {
			System.out.println("Numero valido");
		}

		sc.close();
	}

}
