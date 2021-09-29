package br.cursojava_atividades_aulas1617;

import java.util.Scanner;

public class Primeira_Questao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        boolean notaValida = false;



        do {
            System.out.println("Insira a nota entre 0 e 10");
            double numero = sc.nextDouble();

            if (numero >= 0 && numero <= 10) {
                notaValida = true;
                System.out.println("numero correto " + numero);

            } else {
                //notaValida = false;
                System.out.println("numero invalido, tente novamente");

            }
        }

        while (!notaValida);
    }
}