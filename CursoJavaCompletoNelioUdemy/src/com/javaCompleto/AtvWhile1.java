package com.javaCompleto;

import java.util.Scanner;

public class AtvWhile1 {
	
//	Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//	incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//	impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("insira a senha correta.");
		int senha = in.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha incorreta, tente novamente.");
			senha = in.nextInt();
		}
		System.out.println("Senha correta, obrigado!");
		
		in.close();
	}

}
