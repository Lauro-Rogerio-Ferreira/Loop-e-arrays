package br.com.dio.exercicios;

import java.io.IOException;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        int soma = 0;
        int n = leitor.nextInt();

        while (1 <= n) {
            if (n >= 0) {
                soma += n;
                cont++;
            }
            n = leitor.nextInt();
        }
        double media = soma / cont;
        System.out.println(String.format("Media = " + media));



    }
}
