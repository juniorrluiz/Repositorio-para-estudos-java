package applicationTeste;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class ProgramaRetangulo {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com a altura do retangulo");
		retangulo.altura = in.nextDouble();
		System.out.println("Entre com a largura do retangulo");
		retangulo.largura = in.nextDouble();
		
		System.out.println("Area = " + retangulo.area());
		System.out.println("Area = " + retangulo.perimetro());
		System.out.println("Area = " + retangulo.diagonal());
		
		in.close();
		
	}

}
