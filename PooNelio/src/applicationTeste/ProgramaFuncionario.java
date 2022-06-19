package applicationTeste;

import java.util.Locale;
import java.util.Scanner;

import entities.ValoresFuncionario;

public class ProgramaFuncionario {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		ValoresFuncionario funcionario = new ValoresFuncionario();
		System.out.println("Insira o nome do funcion�rio :");
		funcionario.nome = in.nextLine();
		System.out.println("Insira o sal�rio do funcion�rio :");
		funcionario.salarioBruto = in.nextDouble();
		System.out.println("Insira a taxa do funcion�rio :");
		funcionario.imposto = in.nextDouble();
		
		System.out.println(funcionario);

		System.out.println("Qual percentual de acr�scimo no sal�rio? ");
		double percentual = in.nextDouble();
		funcionario.aumentoPercentual(percentual);
		System.out.println();
		System.out.println("Sal�rio atualizado, $ " + funcionario.salarioComAumento);
		
		
		
		in.close();
		
	}

}
