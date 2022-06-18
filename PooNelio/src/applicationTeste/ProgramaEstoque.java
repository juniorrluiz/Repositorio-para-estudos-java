package applicationTeste;

import java.util.Locale;
import java.util.Scanner;

import entities.ProdutoEstoque;

public class ProgramaEstoque {
	
	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner in = new Scanner(System.in);
			
			ProdutoEstoque produto = new ProdutoEstoque();
			System.out.println("Entre com os dados do produto : ");
			System.out.print("Nome : ");
			produto.nome = in.nextLine();
			System.out.print("Preço : ");
			produto.preco = in.nextDouble();
			System.out.print("Quantidade no estoque : ");
			produto.quantidade = in.nextInt();
			System.out.println();
			
			System.out.println("Dados do produto" + produto);
			System.out.println();
			
			System.out.println("Entre com o numero de produtos a serem adicionados no estoque: ");
			int quantidade = in.nextInt();
			produto.addItens(quantidade); 
			System.out.println();
			System.out.println("Dados do produto atualizados " + produto);
			System.out.println();
			
			System.out.println("Entre com o numero de produtos a serem retirados no estoque: ");
			quantidade = in.nextInt();
			produto.removeItens(quantidade); 
			System.out.println();
			System.out.println("Dados do produto atualizados " + produto);
			
			
			
			in.close();
	}

}
