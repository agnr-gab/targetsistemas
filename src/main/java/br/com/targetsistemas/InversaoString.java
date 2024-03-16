package br.com.targetsistemas;

import java.util.Scanner;

//5) Escreva um programa que inverta os caracteres de um string.
public class InversaoString {

    public static void main(String[] args) {
        // Criar um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar que o usuário informe a string
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();

        // Chamar o método para inverter a string
        String invertedString = inverterString(input);

        // Exibir a string invertida
        System.out.println("String invertida: " + invertedString);

        // Fechar o scanner
        scanner.close();
    }

    // Método para inverter a string
    public static String inverterString(String input) {
        // Converter a string para um array de caracteres
        char[] chars = input.toCharArray();

        // Variável para armazenar a string invertida
        String invertedString = "";

        // Loop para iterar sobre o array de caracteres da string
        for (int i = chars.length - 1; i >= 0; i--) {
            // Adicionar o caractere atual à string invertida
            invertedString += chars[i];
        }

        // Retornar a string invertida
        return invertedString;
    }
}
