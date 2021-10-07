package br.cursojava_atividades_aulas1617;

import java.util.Scanner;

public class Atv5_Questao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean infoValida = false;
        double populacaoA;
        double populacaoB;
        double taxaA;
        double taxaB;

        do {
            System.out.println("Entre com a primeira polulação");
            populacaoA = sc.nextDouble();
            if (populacaoA > 0){
                infoValida = true;
            } else{
                System.out.println("População precisa ser maior que 0 (zero)");
            }
        }while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Entre com a segunda polulação");
            populacaoB = sc.nextDouble();
            if (populacaoB > 0){
                infoValida = true;
            }else {
                System.out.println("População precisa ser maior que 0 (zero)");
            }
        }while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Entre com a primeira taxa");
            taxaA = sc.nextDouble();
            if (taxaA > 0){
                infoValida = true;
            }else {
                System.out.println("A primeira taxa precisa ser maior que 0 (zero)");
            }
        }while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Entre com a segunda taxa");
            taxaB = sc.nextDouble();
            if (taxaB > 0){
                infoValida = true;
            }else {
                System.out.println("A segunda taxa precisa ser maior que 0 (zero)");
            }
        }while (!infoValida);

        int cont = 0;

        while (populacaoA < populacaoB){
            populacaoA += (populacaoA/100) * taxaA;
            populacaoB += (populacaoB/100) * taxaB;
            cont++;
        }

        System.out.println("população A: " + populacaoA);
        System.out.println("população B: " + populacaoB);
        System.out.println("Quantos anos chega: " + cont);

    }
}
