package com.company;

import java.util.Scanner;

public class Main {

    // Escreva um algoritmo que leia o peso e a altura de uma pessoa
    //usuária e informe o seu Índice de Massa Corpórea (IMC). O cálculo é obtido
    //Melhorando nosso algoritmo acima, modifique seu algoritmo de
    //forma que continue lendo o peso e a altura de uma pessoa usuária, sendo
    //que agora seu programa deve informar se a condição dessa pessoa usuária
    //de acordo com a tabela abaixo do resultado do cálculo do Índice de Massa
    //Corpórea (IMC). Lembrando que esse cálculo é obtido pela divisão entre o
    //valor do seu peso e o quadrado do valor da sua altura.

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o seu peso: ");
        float peso = scan.nextFloat();

        System.out.print("Informe a sua altura: ");
        float altura = scan.nextFloat();

        float imc = peso / (altura * altura);
        System.out.println("O seu IMC é " + imc);

        System.out.format("O seu IMC é %.2f ", imc);

        if (imc < 19.1){
            System.out.println("\nVoce está abaixo do peso.");
        } else if( imc >= 19.1 && imc < 25.8) {
            System.out.println("\nVoce está no peso normal.");
        } else if ( imc >= 25.8 && imc < 27.3) {
            System.out.println("\nVoce está marginalmente acima do peso.");
        } else if ( imc >= 27.3 && imc < 32.3) {
            System.out.println("\nVoce está acima do peso.");
        } else {
            System.out.println("\nObesidade Grau I");
        }
    }
}
