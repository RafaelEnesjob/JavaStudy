package EstudosJava.EstruturasRepetitivas;

import java.util.Scanner;

/*
TODO: Problema Exemplo: Fazer um programa que lê números inteiros até que um zero seja lido. Ao final mostra a soma dos números lidos.
TODO: Qual é a lógica para resolver esse algoritmo?
- ter uma variável que receba esse número inteiro
- usar while para executar enquanto esses numeros recebidos for diferente de 0
- ao receber um numero 0, pegar os outro numeros que foram lidos e somar e guardar em uma variavel soma e exibir ela,
 */


import java.util.Scanner;

public class Enquanto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int soma = 0;

        System.out.println("Informe um número inteiro (0 para terminar):");

        // Leia o primeiro número antes de entrar no loop
        numero = entrada.nextInt();

        // Use um loop while para continuar lendo números até que zero seja inserido
        while (numero != 0) {
            soma += numero;  // Adicione o número à soma
            System.out.println("Informe um número inteiro (0 para terminar):");
            numero = entrada.nextInt();  // Leia o próximo número
        }

        System.out.println("A soma dos números lidos é: " + soma);
        entrada.close(); // Fechar o Scanner
    }
}

