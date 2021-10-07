package br.cursojava_atividades_aulas1617;

import java.util.Scanner;

public class Atv13_Questao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // boolean infoValida = false;

        /* while (true) {

            System.out.println("insira o numero para a tabuada");
            int num = sc.nextInt();

            System.out.println("tabuada de " + num + " :");
            System.out.println(num + " x 1 = " + num);
            System.out.println(num + " x 2 = " + (num * 2));
            System.out.println(num + " x 3 = " + (num * 3));
            System.out.println(num + " x 4 = " + (num * 4));
            System.out.println(num + " x 5 = " + (num * 5));
            System.out.println(num + " x 6 = " + (num * 6));
            System.out.println(num + " x 7 = " + (num * 7));
            System.out.println(num + " x 8 = " + (num * 8));
            System.out.println(num + " x 9 = " + (num * 9));
            System.out.println(num + " x 10 = " + (num * 10));

        } */

        while (true) {
            System.out.println("insira o numero para a tabuada");
            int outroNum = sc.nextInt();

            System.out.println("tabuada de " + outroNum + " :");

            for (int i = 1; i <= 10; i++) {
                System.out.println(outroNum + " x " + i + " = " + (outroNum * i));
            }
        }
    }
}
