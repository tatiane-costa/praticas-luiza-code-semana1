package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

	//Escreva um programa que adote um ArrayList como estrutura
    //padrão de armazenamento de dados. O programa deverá cadastrar (sem
    // interação da pessoa usuária), 10 valores de qualquer tipo dentro da lista
    //(String, int, char, double, etc). Ao final, o programa deverá mostrar os valores
    //cadastrados.

        List numeros = new ArrayList();

        numeros.add("5");
        numeros.add("10");
        numeros.add("15");
        numeros.add("20");
        numeros.add("25");
        numeros.add("30");
        numeros.add("35");
        numeros.add("40");
        numeros.add("45");
        numeros.add("50");

        System.out.println(numeros);

    }
}
