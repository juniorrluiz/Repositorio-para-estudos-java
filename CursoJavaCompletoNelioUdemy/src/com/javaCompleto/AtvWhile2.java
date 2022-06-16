package com.javaCompleto;

import java.util.Scanner;

public class AtvWhile2 {
//	Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//	cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//	menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		while(x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			} else if ( x < 0 && y > 0) {
				System.out.println("Segundo");
			} else if(x < 0 && y < 0) {
				System.out.println("Terceiro");
			} else {
				System.out.println("Quarto");
			}
			x = in.nextInt();
			y = in.nextInt();
		} 
		
		
		in.close();

	}

}
