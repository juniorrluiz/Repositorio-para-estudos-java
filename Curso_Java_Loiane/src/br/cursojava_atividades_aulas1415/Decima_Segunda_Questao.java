package br.cursojava_atividades_aulas1415;

import java.util.Scanner;

/*12.Fa�a um programa para o c�lculo de uma folha de pagamento, 
sabendo que os descontos s�o do Imposto de Renda, que depende do sal�rio bruto (conforme tabela abaixo) e 3% para o Sindicato e que o 
FGTS corresponde a 11% do Sal�rio Bruto, mas n�o � descontado (� 
a empresa que deposita). O Sal�rio L�quido corresponde ao Sal�rio 
Bruto menos os descontos. O programa dever� pedir ao usu�rio o 
valor da sua hora e a quantidade de horas trabalhadas no m�s.
o Desconto do IR:
o Sal�rio Bruto at� 900 (inclusive) - isento
o Sal�rio Bruto at� 1500 (inclusive) - desconto de 5%
o Sal�rio Bruto at� 2500 (inclusive) - desconto de 10%
o Sal�rio Bruto acima de 2500 - desconto de 20% Imprima na tela 
as informa��es, dispostas conforme o exemplo abaixo. No 
exemplo o valor da hora � 5 e a quantidade de hora � 220.
Sal�rio Bruto: (5 * 220) : R$ 1100,00 
(-) IR (5%) : R$ 55,00 
(-) INSS ( 10%) : R$ 110,00 
FGTS (11%) : R$ 121,00 
Total de descontos : R$ 165,00 
Sal�rio Liquido : R$ 935,00*/

public class Decima_Segunda_Questao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o valor da sua hora trabalhada e quantas horas voc� trabalhou no mes");
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
