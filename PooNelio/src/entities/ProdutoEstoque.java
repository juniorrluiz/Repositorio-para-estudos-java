package entities;

public class ProdutoEstoque {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalEmEstoque() {
		return quantidade * preco;
	
	}

	public void addItens(int quantidade) {
		this.quantidade += quantidade;
		//this.quantidade = quantidade  + this.quantidade;
	}
	
	public void removeItens (int quantidade) {
		this.quantidade -= quantidade;
		//this.quantidade = quantidade - this.quantidade;
	}
	
	public String toString() {
		return  nome 
				+ ", $ " 
				+ String.format("%.2f", preco) 
				+ ", " 
				+ quantidade 
				+ " quantidade , Total R$ " 
				+ String.format("%.2f", totalEmEstoque()) ;
	}
}
