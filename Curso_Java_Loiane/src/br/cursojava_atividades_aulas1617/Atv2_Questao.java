package br.cursojava_atividades_aulas1617;

import java.util.Objects;
import java.util.Scanner;

public class Atv2_Questao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean correto = false;

        do {
            System.out.println("Insira seu usuario");
            String usuario = sc.next();
            System.out.println("Insira sua senha");
            String senha = sc.next();

            if (!Objects.equals(usuario, senha)) {
                correto = true;
                System.out.println("usuario e senha correta ");

            } else {
                //notaValida = false;
                System.out.println("o usuario e senha nao podem ser iguais");

            }
        }

        while (!correto);
    }
}