package br.cursojava_atividades;

import java.util.Scanner;

public class Decima_Primeira_Questao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("insira seu salário");
		double salario = sc.nextDouble();
		
		int percentual = 0;
		boolean salarioValido = false;
	
	
		do {
	
		if (salario <= 280) {
			percentual = 20;
		} else if ( salario > 280 && salario <= 700 ) {
			percentual = 15;
		} else if (salario > 700 && salario <= 1500) {
			percentual = 10;
		} else if (salario > 1500) {
			percentual = 5;
		}
		
		double aumento = (salario / 100) * percentual;
		double novoSalario = salario + aumento;


		System.out.println("O salário antes do reajuste: " + salario);
		System.out.println("O percentual de aumento aplicado: " + percentual);
		System.out.println("O valor do aumento: " + aumento);
		System.out.println("O novo salário, após o aumento: " + novoSalario);
		
		
		System.out.println(" \nInsira seu salario");
		salario = sc.nextDouble();
			
		} while (!salarioValido);
		
			
		
		
		/*int percentual = 0;
		if (salario <= 280) {
			percentual = 20;
		} else if ( salario > 280 && salario <= 700 ) {
			percentual = 15;
		} else if (salario > 700 && salario <= 1500) {
			percentual = 10;
		} else if (salario > 1500) {
			percentual = 5;
		}*/

		/*double aumento = (salario / 100) * percentual;
		double novoSalario = salario + aumento;


		System.out.println("O salário antes do reajuste: " + salario);
		System.out.println("O percentual de aumento aplicado: " + percentual);
		System.out.println("O valor do aumento: " + aumento);
		System.out.println("O novo salário, após o aumento: " + novoSalario);*/
		

		sc.close();
	}

}
