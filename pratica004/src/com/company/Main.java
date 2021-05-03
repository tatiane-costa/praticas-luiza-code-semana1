package com.company;

import java.util.Scanner;

public class Main {

    // Faça um algoritmo que mostre os números que são divisíveis de
    //um número digitado pela pessoa usuária. Além desse número, o usuário deve
    //indicar também o número inicial e final da busca.
    //Exemplo:
    //Número divisíveis: 9
    //De 30 até 238

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número para verificar todos seus divisores: ");
        int numero = scan.nextInt();
        System.out.print("Informe qual o número inícial do intervalo a ser verificado: ");
        int int1 = scan.nextInt();
        System.out.print("Agora informe qual o número final do intervalo a ser verificado: ");
        int int2 = scan.nextInt();

        int divisivel;

        for (divisivel = int1; divisivel <= int2; divisivel++) {
            if (divisivel % numero == 0) {
                System.out.println("Número " + numero + " é divisivel por: " + divisivel);
            }
        }
    }
}

