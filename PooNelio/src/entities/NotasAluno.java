package entities;

public class NotasAluno {

	public String nomeAluno;
	public double nota1, nota2, nota3;


	public double somaNotas() {
		return nota1 + nota2 + nota3;
	}

	public String verificaPassou() {
		if (somaNotas() > 60) {
			return "Passou!";
		} else {
			return "Perdeu \n" 
					+ "Faltou : "  + String.format("%.2f", 60 - somaNotas()) + " pontos";
		}
	}
}