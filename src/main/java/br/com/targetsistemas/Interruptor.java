package br.com.targetsistemas;

import java.util.Random;

/*
 * 4) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Você não pode
 * ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser.
 * Seu objetivo é descobrir qual interruptor controla qual lâmpada.
 * Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas,
 * qual interruptor controla cada lâmpada?
 */

public class Interruptor {
    public static void main(String[] args) {
        // Simulação das três lâmpadas e seus estados (true = acesa, false = apagada)
        boolean[] lampadas = new boolean[3];

        // Simulação dos três interruptores
        boolean[] interruptores = new boolean[3];

        // Gerador de números aleatórios para simular o estado inicial das lâmpadas
        Random random = new Random();

        // Define aleatoriamente o estado inicial das lâmpadas
        for (int i = 0; i < lampadas.length; i++) {
            lampadas[i] = random.nextBoolean();
        }

        // Simulação da primeira visita: ligar um interruptor e desligá-lo, ligar outro interruptor
        // O terceiro interruptor será ligado automaticamente quando o segundo for desligado
        ligarInterruptor(interruptores, 0);
        desligarInterruptor(interruptores, 0);
        ligarInterruptor(interruptores, 1);

        // Simulação da segunda visita: verificar o estado das lâmpadas
        for (int i = 0; i < lampadas.length; i++) {
            if (lampadas[i]) {
                System.out.println("Lâmpada " + (i + 1) + " está acesa, então o interruptor " + (i + 1)
                        + " está conectado a ela.");
            } else {
                System.out.println("Lâmpada " + (i + 1) + " está apagada, então o interruptor " + ((i + 1) % 3 + 1)
                        + " está conectado a ela.");
            }
        }
    }

    // Método para ligar um interruptor
    public static void ligarInterruptor(boolean[] interruptores, int indice) {
        interruptores[indice] = true;
    }

    // Método para desligar um interruptor
    public static void desligarInterruptor(boolean[] interruptores, int indice) {
        interruptores[indice] = false;
    }
}


