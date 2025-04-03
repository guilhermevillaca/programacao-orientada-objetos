package br.com.guilhermevillaca.exemplos;

import java.util.Arrays;

public class MegaSena {
    public static void main(String[] args) {
        int[] numerosSorteados = new int[6];

        for (int i = 0; i < 6; i++) {
            numerosSorteados[i] = (int) (Math.random() * 60) + 1; // Gera números entre 1 e 60
        }

        System.out.println("Números sorteados: " + Arrays.toString(numerosSorteados));
    }
}