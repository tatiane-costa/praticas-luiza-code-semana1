package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // - Faça um programa que receba um número digitado pela pessoa
        // usuária e mostre o menu para selecionar o tipo de cálculo que deve ser
        //realizado:
        //Raiz quadrada
        //A metade
        //10% do número
        //O dobro
        //Sair
        //O algoritmo só deve terminar, se o usuário escolher a opção 5

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o número que deseja realizar um cálculo: ");
        int num = scan.nextInt();

        System.out.println("Escolha o código desejado:");
        System.out.println("(1) - Raiz Quadrada");
        System.out.println("(2) - A metade");
        System.out.println("(3) - 10% do numero");
        System.out.println("(4) - O dobro");
        System.out.println("(5) - Sair");

        System.out.println("Qual o cálculo que deseja realizar?");
        int calculo = scan.nextInt();

        int valorTotal;

    switch (calculo) {
        case 1:
//          valorTotal = Math.sqrt(num);
            System.out.println("A raiz quadrada é " + Math.sqrt(num) );
            break;
        case 2:
           System.out.println("A metade é " + num / 2);
           break;
        case 3:
           System.out.println("10% do numero é " + (num * 10) / 100);
           break;
        case 4:
           valorTotal = num * 2;
           System.out.printf("O dobro do valor é %d ", valorTotal);
           break;

        }
    }
}
