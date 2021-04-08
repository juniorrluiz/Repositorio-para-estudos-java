package br.cursojava_atividades;

import java.util.Scanner;

/*11.As Organizações Tabajara resolveram dar um aumento de salário aos 
seus colaboradores e lhe contraram para desenvolver o programa que 
calculará os reajustes.
o Faça um programa que recebe o salário de um colaborador e o 
reajuste segundo o seguinte critério, baseado no salário atual:
o salários até R$ 280,00 (incluindo) : aumento de 20%
o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o salários de R$ 1500,00 em diante : aumento de 5% Após o 
aumento ser realizado, informe na tela:
o o salário antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo salário, após o aumento.*/

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
