package br.com.dio.exercicios;

import java.util.Scanner;

/*Faça um programa que peça 5 números,
* informe o maior número,
* informe a média desses números*/

public class Loops2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            count = count + 1;

            soma = soma + numero;

            if (numero > maior) maior = numero;

        } while(count < 5);

        System.out.println("Dos cinco números o maior é: " + maior);
        System.out.println("Média: " + (soma/5));

    }
}
