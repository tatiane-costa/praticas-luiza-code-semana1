package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

	    //- Escreva um programa que cadastre em uma lista numérica de
        //valores inteiros 10 números inteiros aleatórios entre 10 e 100. Ao final, o
        //programa deverá detectar na lista qual o maior número inteiro sorteado e
        //mostrá-lo ao usuário

    List<Integer> numbers = new ArrayList<>();
    Random aleatorio = new Random();

        System.out.println("Lista: ");
           for (int i = 0; i < 10; i++) {
                int valor = aleatorio.nextInt(91) + 10;
           numbers.add(valor);
                System.out.printf("%d ", valor);
        }

        System.out.printf("\nO maior numero da lista eh: %d", Collections.max(numbers));
    }
}

