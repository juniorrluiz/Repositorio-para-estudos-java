package com.javaCompleto;

import java.util.Scanner;

public class AtividadeFor01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Entre com um numero inteiro ");
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.print(i + ", ");
				
			}
			
		}
		
	}

}
