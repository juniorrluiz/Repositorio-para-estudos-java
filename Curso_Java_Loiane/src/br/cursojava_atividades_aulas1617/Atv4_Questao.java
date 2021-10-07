package br.cursojava_atividades_aulas1617;

import java.util.Scanner;

public class Atv4_Questao {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        int populacaoA = 80000;
        int populacaoB = 200000;
        int cont = 0;

        while (populacaoA <= populacaoB){
            populacaoA += (populacaoA/100) * 3;
            populacaoB += (populacaoB/100) * 1.5;
            cont++;
        }
        System.out.println("população A: " + populacaoA);
        System.out.println("população B: " + populacaoB);
        System.out.println("Quantos anos chega: " + cont);

    }
}