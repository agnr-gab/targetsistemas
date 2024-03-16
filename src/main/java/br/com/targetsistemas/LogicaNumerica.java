package br.com.targetsistemas;

//3) Descubra a lógica e complete o próximo elemento:
public class LogicaNumerica {
    public static void main(String[] args) {
        System.out.println("Sequência a): " + proximoA(7));
        System.out.println("Sequência b): " + proximoB(64));
        System.out.println("Sequência c): " + proximoC(36));
        System.out.println("Sequência d): " + proximoD(64));
        System.out.println("Sequência e): " + proximoE(8));
        System.out.println("Sequência f): " + proximoF(19));
    }

    public static int proximoA(int numeroAtual) {
        return numeroAtual + 2;
    }

    public static int proximoB(int numeroAtual) {
        return numeroAtual * 2;
    }

    public static int proximoC(int numeroAtual) {

        return numeroAtual + 2 + (int) Math.sqrt(numeroAtual);
    }

    public static int proximoD(int numeroAtual) {
        return numeroAtual + 4;
    }

    public static int proximoE(int numeroAtual) {

        int penultimo = 1;
        int ultimo = 1;
        int proximo = penultimo + ultimo;
        while (proximo < numeroAtual) {
            penultimo = ultimo;
            ultimo = proximo;
            proximo = penultimo + ultimo;
        }
        return proximo;
    }

    public static int proximoF(int numeroAtual) {

        int incremento = 2;
        if (numeroAtual % 2 == 0) {
            incremento = 4;
        } else if (numeroAtual == 16) {
            incremento = 1;
        }
        return numeroAtual + incremento;
    }
}