package br.cursojava_atividades;

import java.util.Scanner;

/*11.As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos 
seus colaboradores e lhe contraram para desenvolver o programa que 
calcular� os reajustes.
o Fa�a um programa que recebe o sal�rio de um colaborador e o 
reajuste segundo o seguinte crit�rio, baseado no sal�rio atual:
o sal�rios at� R$ 280,00 (incluindo) : aumento de 20%
o sal�rios entre R$ 280,00 e R$ 700,00 : aumento de 15%
o sal�rios entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o sal�rios de R$ 1500,00 em diante : aumento de 5% Ap�s o 
aumento ser realizado, informe na tela:
o o sal�rio antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo sal�rio, ap�s o aumento.*/

public class Decima_Primeira_Questao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("insira seu sal�rio");
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


		System.out.println("O sal�rio antes do reajuste: " + salario);
		System.out.println("O percentual de aumento aplicado: " + percentual);
		System.out.println("O valor do aumento: " + aumento);
		System.out.println("O novo sal�rio, ap�s o aumento: " + novoSalario);
		
		
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


		System.out.println("O sal�rio antes do reajuste: " + salario);
		System.out.println("O percentual de aumento aplicado: " + percentual);
		System.out.println("O valor do aumento: " + aumento);
		System.out.println("O novo sal�rio, ap�s o aumento: " + novoSalario);*/
		

		sc.close();
	}

}
