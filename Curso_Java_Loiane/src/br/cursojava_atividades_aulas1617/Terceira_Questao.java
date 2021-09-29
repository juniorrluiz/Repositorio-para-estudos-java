package br.cursojava_atividades_aulas1617;

import java.util.Objects;
import java.util.Scanner;

public class Terceira_Questao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seus dados abaixo: \n");

        boolean infoValida = false;

        do {
            System.out.println("Insira seu nome");
            String nome = sc.next();
            if (nome.length() >= 3){
                infoValida = true;
                //System.out.println("nome correto");
            }else{
                System.out.println("o nome precisa ter mais que 3 letras");
            }
        } while (!infoValida);

            infoValida = false;

            do {
                System.out.println("Insira sua idade");
                int idade = sc.nextInt();
                if (idade >=0 && idade <= 150){
                    infoValida = true;
                    //System.out.println("Idade correta");
                } else{
                    System.out.println("idade incorreta, ela deve ser entre 0 a 150.");
                }
            }while (!infoValida);

            infoValida = false;

            do {
                System.out.println("Insira seu salário");
                double salario = sc.nextDouble();
                if (salario > 0){
                    infoValida = true;
                    //System.out.println("Salario correto");
                }else{
                    System.out.println("O salario precisa ser maior que 0");
                }
            }while (!infoValida);

            infoValida = false;

            do {
                System.out.println("Insira seu sexo (F) para feminino e (M) para masculino");
                String sexo = sc.next();
                if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")){
                    infoValida = true;
                } else{
                    System.out.println("Sexo precisa ser f ou m");
                }
            }while (!infoValida);

            do {
                System.out.println("Insira seu estado civil, 's','c','v','d'.");
                String estadoCivil = sc.next();
                if (estadoCivil.equalsIgnoreCase("s")|| estadoCivil.equalsIgnoreCase("c")||
                        estadoCivil.equalsIgnoreCase("v")|| estadoCivil.equalsIgnoreCase("d")){
                    infoValida = true;
                } else{
                    System.out.println("estado civil deve ser 's','c','v','d'.");
                }
            }while (!infoValida);


    }
}