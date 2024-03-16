package br.com.targetsistemas;

public class Soma {
    public static void main(String[] args) {
        final int INDICE = 13;
        int soma = 0;
        int k = 0;

        while (k < INDICE) {
            k++;
            soma += k;
        }

        System.out.println("A soma da sequência é: " + soma);
    }

}
