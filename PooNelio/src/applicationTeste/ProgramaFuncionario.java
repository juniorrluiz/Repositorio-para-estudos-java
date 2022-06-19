package applicationTeste;

import java.util.Locale;
import java.util.Scanner;

import entities.ValoresFuncionario;

public class ProgramaFuncionario {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		ValoresFuncionario funcionario = new ValoresFuncionario();
		System.out.println("Insira o nome do funcionário :");
		funcionario.nome = in.nextLine();
		System.out.println("Insira o salário do funcionário :");
		funcionario.salarioBruto = in.nextDouble();
		System.out.println("Insira a taxa do funcionário :");
		funcionario.imposto = in.nextDouble();
		
		System.out.println(funcionario);

		System.out.println("Qual percentual de acréscimo no salário? ");
		double percentual = in.nextDouble();
		funcionario.aumentoPercentual(percentual);
		System.out.println();
		System.out.println("Salário atualizado, $ " + funcionario.salarioComAumento);
		
		
		
		in.close();
		
	}

}
