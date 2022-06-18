package br.com.dio.exercicios;

import java.util.Scanner;

/*Faça um programa que leia conjunto de dois valores,
* o primeiro representa o nome dos aluno e o segundo representa a sua idade.
* (Pare o programa inserindo o número 0)
* */

public class Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();

            System.out.println("Idade: ");
            idade = scan.nextInt();
            if(nome.equals("0")) break;

        }
        System.out.println("Continua aqui....");

    }
}
