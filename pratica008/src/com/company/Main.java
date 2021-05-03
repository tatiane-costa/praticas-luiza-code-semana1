package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Escreva um programa que contenha uma lista com 5 nomes
        //pré-cadastrados. O programa deverá dar à pessoa usuária a opção de
        //excluir um único nome da lista , com valores entre 1 e 5, exemplo abaixo.
        //Qual dos nomes abaixo você deseja excluir da lista?
        //1. Tainá
        //2. Stellinha
        //3. Tequillina
        //4. Pituzinho
        //5. <Seu Nome>
        //Feita a escolha do número correspondente ao nome, o programa deverá
        //mostrar na tela os quatro nomes que restaram cadastrados na lista.

        Scanner teclado = new Scanner(System.in);
        int op;
        List<String> names = new ArrayList<String>();

        names.add("Tainá");
        names.add("Stellinha");
        names.add("Tequillina");
        names.add("Pituzinha");
        names.add("Tatiane");

        System.out.println("--------------------------------------------------- \n" +
                "(1) Tainá \n" +
                "(2) Stellinha \n" +
                "(3) Tequillina \n" +
                "(4) Pituzinha \n" +
                "(5) Tatiane");
        System.out.println("Qual dos nome abaixo voce deseja excluir da lista?\n" +
                "---------------------------------------------------");

        op = teclado.nextInt()-1;

        System.out.printf("%s foi removida! Verifique: \n", names.get(op));

        names.remove(op);

        for (Object value : names){
            System.out.println(value);
        }
    }
}
