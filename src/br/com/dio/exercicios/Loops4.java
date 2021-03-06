package br.com.dio.exercicios;

import java.util.Scanner;

/*Desenvolva um gerador de tabuada.
* Capaz de desenvolver a tabuada de qualquer número inteiro entre 1 a 10.
* O usuário deve informar de qual número ele deseja ver a tabuada.
* A saída deve ser igual ao exemplo abaixo:
*
* Tabuada de 5:
* 5 x 1 = 5
* 5 x 2 = 10
* ...
* 5 x 10 = 50
* */
public class Loops4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada do: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for (int i =1; i <= 10; i = i + 1) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));

        }

    }
}
