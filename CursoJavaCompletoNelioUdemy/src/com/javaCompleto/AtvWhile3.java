package com.javaCompleto;

import java.util.Scanner;

public class AtvWhile3 {
//	Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//	um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//	4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//	que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//	mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//	exemplo.

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Bem vindo, selecione o tipo de combustivel \n"
				+ "1.Álcool\n"
				+ "2.Gasolina\n"
				+ "3.Diesel\n"
				+ "4.Fim\n");
		int tipo = in.nextInt();
		int ac = 0;
		int gs = 0;
		int dl = 0;
		
		while (tipo != 4) {
			
			if(tipo == 1) {
				ac = ac + 1;
			} else if (tipo == 2) {
				gs = gs + 1;
			} else if (tipo == 3) {
				dl = dl + 1;
			}
			tipo = in.nextInt();
		}
		System.out.println("Muito obrigado !");
		System.out.println("Alcool = " + ac);
		System.out.println("Gasolina = " + gs);
		System.out.println("Diesel = " + dl);
		
		
		
		
		in.close();
	}

}
