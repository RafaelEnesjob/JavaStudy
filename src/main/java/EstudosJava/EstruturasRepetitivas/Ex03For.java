package EstudosJava.EstruturasRepetitivas;

import java.util.Scanner;

/*
TODO Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
     segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */

public class Ex03For {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        System.out.println("Leia um numero N: ");
        n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            int primeiro;
            int segundo;
            System.out.println("Informe os pares de numeros: ");
            primeiro = entrada.nextInt();
            segundo = entrada.nextInt();

            if (segundo == 0) {
                // Se o segundo número (denominador) for zero, a divisão não pode ser realizada
                System.out.println("Divisao impossivel");
            } else {
                // Converte 'primeiro' para double para realizar a divisão de ponto flutuante
                double resultadoDivisao = (double) primeiro / segundo;
                // Exibe o resultado da divisão com uma casa decimal
                System.out.printf("%.1f%n", resultadoDivisao);
            }

        }

    }
}
