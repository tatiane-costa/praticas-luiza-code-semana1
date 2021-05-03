package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Escreva um programa que receba cinco nomes diferentes da
        //pessoa usuária. Todos os nomes deverão ser armazenados em um ArrayList
        //tipado para Strings. O programa deverá mostrar os nomes cadastrados em
        //ordem inversa a qual foram cadastrados, ou seja, do último para o primeiro.

        List<String> names = new ArrayList<String>();

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Qual eh o nome da vez? ");
            names.add(teclado.next());
        }

        Collections.reverse(names);

        for (Object value : names){
            System.out.println(value);
        }
    }
}
