package br.cursojava_atividades;

import java.util.Scanner;

/*Fa�a um Programa que verifique se uma letra digitada � "F" ou "M". 
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inv�lido.*/


public class Terceira_Questao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String letra;
		
		System.out.println("Entre com o seu sexo");
		letra = sc.next();
		
		if(letra.equalsIgnoreCase("f")) {
			System.out.println("Feminino");
		} else if (letra.equalsIgnoreCase("m")) {
			System.out.println("Masculino");
		} else {
			System.out.println("Sexo invalido");
			
		}
		

		sc.close();
	}

}
