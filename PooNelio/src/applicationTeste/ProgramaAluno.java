package applicationTeste;

import java.util.Locale;
import java.util.Scanner;

import entities.NotasAluno;

public class ProgramaAluno {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		NotasAluno notasAluno = new NotasAluno();
		System.out.println("Insira seu nome");
		notasAluno.nomeAluno = in.nextLine();
		System.out.println("Insira suas notas do trimestre");
		notasAluno.nota1 = in.nextDouble();
		notasAluno.nota2 = in.nextDouble();
		notasAluno.nota3 = in.nextDouble();

		System.out.printf("Nota final : %.2f%n" , notasAluno.somaNotas());
		System.out.printf(notasAluno.verificaPassou());

		in.close();

	}

}
