package entities;

public class ValoresFuncionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	public double salarioComAumento;
	
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentoPercentual( double percentual ) {
		this.salarioComAumento = salarioLiquido() + ((percentual / 100) * salarioBruto);
		
	}
	
	public String toString() {
		return "Funcionário : " + nome + "\n" + 
				"Salario bruto : " + String.format("%.2f", salarioBruto) + "\n" + 
				"Imposto : "+  String.format("%.2f", imposto) + "\n" + "\n" +
				"Funcionário : " + nome + ", $ " + String.format("%.2f", salarioLiquido()) ; 
	}

}
