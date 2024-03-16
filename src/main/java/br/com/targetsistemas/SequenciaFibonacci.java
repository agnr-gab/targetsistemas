package br.com.targetsistemas;

import java.util.Scanner;

/*2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será
a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa
na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e
retorne uma mensagem avisando se o número informado pertence ou não a sequência.*/

public class SequenciaFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        boolean pertence = verificaSePertenceFibonacci(numero);

        if (pertence) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean verificaSePertenceFibonacci(int numero) {
        int anterior = 0;
        int atual = 1;

        if (numero == 0) {
            return true;
        }

        while (atual <= numero) {
            if (atual == numero) {
                return true;
            }

            int proximo = anterior + atual;

            anterior = atual;
            atual = proximo;
        }

        return false;
    }
}
