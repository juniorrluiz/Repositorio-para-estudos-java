package br.cursojava_atividades_aulas1617;

import java.util.Scanner;

public class Atv8_Questao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num;
        double media;
        double soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("insira o numero");
            num = sc.nextDouble();

            soma += num;
        }
            media = soma / 5;

        System.out.println("a media é " + media);
        System.out.println("a soma é " + soma);
    }
}
