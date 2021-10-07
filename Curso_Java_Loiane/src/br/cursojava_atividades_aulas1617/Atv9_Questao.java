package br.cursojava_atividades_aulas1617;

import java.util.Scanner;

public class Atv9_Questao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
