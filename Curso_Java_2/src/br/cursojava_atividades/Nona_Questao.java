package br.cursojava_atividades;

import java.util.Scanner;

public class Nona_Questao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("insira 3 numeros");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();

		if (num1 < num2 && num1 < num3 && num2 < num3) {
			System.out.println(num3 + " - " + num2 + " - " + num1);
			
		}else if(num1 < num2 && num1 < num3 && num3 < num2) {
			System.out.println(num2 + " - " + num3 + " - " + num1);
			
		}else if (num2 < num1 && num2 < num3 && num1 < num3){
			System.out.println(num3 + " - " + num1 + " - " + num2);
			
		}else if (num2 < num1 && num2 < num3 && num3 < num1){
			System.out.println(num1 + " - " + num3 + " - " + num2);
			
		}else if (num3 < num1 && num3 < num2 && num1 < num2){
			System.out.println(num2 + " - " + num1 + " - " + num3);
			
		}else if (num3 < num1 && num3 < num2 && num2 < num1){
			System.out.println(num1 + " - " + num2 + " - " + num3);
		}

		sc.close();
	}

}
