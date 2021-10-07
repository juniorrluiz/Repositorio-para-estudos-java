package br.cursojava_atividades_aulas1617;

import java.util.Scanner;

public class Atv7_Questao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* System.out.println("Insira o primeiro numero");
        int num1 = sc.nextInt();
        System.out.println("Insira o segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Insira o terceiro numero");
        int num3 = sc.nextInt();
        System.out.println("Insira o quarto numero");
        int num4 = sc.nextInt();
        System.out.println("Insira o quinto numero");
        int num5 = sc.nextInt();

        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
            System.out.println("o numero maior é o : " + num1);
        }
        if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
            System.out.println("o numero maior é o : " + num2);
        }
        if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){
            System.out.println("o numero maior é o : " + num3);
        }
        if (num4 > num1 && num4 > num3 && num4 > num5 && num4 > num2){
            System.out.println("o numero maior é o : " + num4);
        }
        if (num5 > num2 && num5 > num3 && num5 > num1 && num5 > num4){
            System.out.println("o numero maior é o : " + num5);
        } */

        int num;
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 5 ; i++) {
            System.out.println("insira o numero");
            num = sc.nextInt();

            if (num > maior){
                maior = num;
               // System.out.println("o maior mudou foi o : " + maior);
            }
        }
        System.out.println("o maior é o : " + maior);

    }
}
