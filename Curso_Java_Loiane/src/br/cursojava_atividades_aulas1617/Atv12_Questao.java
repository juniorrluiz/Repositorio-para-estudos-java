package br.cursojava_atividades_aulas1617;

import java.util.Scanner;

public class Atv12_Questao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("insira o primeiro numero");
        int num1 = sc.nextInt();
        System.out.println("insira o segundo numero");
        int num2 = sc.nextInt();

        int soma = 0;

        for (int i = num1; i <= num2; i++) {
            soma += i;
        }
        System.out.println(soma);
    }
}
