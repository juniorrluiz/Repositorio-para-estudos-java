package br.cursojava_atividades;

import java.util.Scanner;

/*12.Faça um programa para o cálculo de uma folha de pagamento, 
sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o 
FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é 
a empresa que deposita). O Salário Líquido corresponde ao Salário 
Bruto menos os descontos. O programa deverá pedir ao usuário o 
valor da sua hora e a quantidade de horas trabalhadas no mês.
o Desconto do IR:
o Salário Bruto até 900 (inclusive) - isento
o Salário Bruto até 1500 (inclusive) - desconto de 5%
o Salário Bruto até 2500 (inclusive) - desconto de 10%
o Salário Bruto acima de 2500 - desconto de 20% Imprima na tela 
as informações, dispostas conforme o exemplo abaixo. No 
exemplo o valor da hora é 5 e a quantidade de hora é 220.
Salário Bruto: (5 * 220) : R$ 1100,00 
(-) IR (5%) : R$ 55,00 
(-) INSS ( 10%) : R$ 110,00 
FGTS (11%) : R$ 121,00 
Total de descontos : R$ 165,00 
Salário Liquido : R$ 935,00*/

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
