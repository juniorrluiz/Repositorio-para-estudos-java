package br.cursojava_atividades;

import java.util.Scanner;

public class Decima_Segunda_Questao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o valor da sua hora trabalhada e quantas horas você trabalhou no mes");
		double valorHora = sc.nextInt();
		double horaTrabalhada = sc.nextInt();

		double salarioBruto = valorHora * horaTrabalhada;
		
		int descontoIr = 0;
		if (salarioBruto <= 900) {
			descontoIr = 0;
		}else if( salarioBruto > 900 && salarioBruto <= 1500) {
			descontoIr = 5;
		}else if(salarioBruto > 1500 && salarioBruto <= 2500 ) {
			descontoIr = 10;
		} else {
			descontoIr = 20;
		}

		double imposto = (salarioBruto/100) * descontoIr;
		double inss = (salarioBruto/100) * 10;
		double fgts = (salarioBruto/100) * 11;
		double totalDescontos = imposto + inss;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salario Bruto:              R$ " + salarioBruto);
		System.out.println("IR:  (" + descontoIr + "%)" +":                 R$ " + imposto);
		System.out.println("Inss (10%):                 R$ "  + inss);
		System.out.println("FGTS (11%):                 R$ "   + fgts);
		System.out.println("Total dos descontos:        R$ "  + totalDescontos);
		System.out.println("Salario Liquido:            R$ " + salarioLiquido);
		


		sc.close();
	}

}
