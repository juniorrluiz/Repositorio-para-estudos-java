package applicationTeste;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class ProgramTriangle {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		Triangulo  x,y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite os lados do triangulo X: ");
		x.a = in.nextDouble();
		x.b = in.nextDouble();
		x.c = in.nextDouble();
		System.out.println("Digite os lados do triangulo Y: ");
		y.a = in.nextDouble();
		y.b = in.nextDouble();
		y.c = in.nextDouble();
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("Area do triangulo X  %.4f%n" ,areaX);
		System.out.printf("Area do triangulo Y : %.4f%n" , areaY);
		
		if (areaX > areaY) {
			System.out.println("Triangulo X maior");
		} else {
			System.out.println("Triangulo Y maior");
		}
		
		
		
		in.close();
	}

}
