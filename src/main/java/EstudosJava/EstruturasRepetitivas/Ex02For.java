package EstudosJava.EstruturasRepetitivas;

import java.util.Scanner;

/*
TODO:
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
 */
public class Ex02For {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;

        System.out.println("Informe um valor inteiro N: ");
        n = entrada.nextInt();

        for (int i = 0; i < n; i++) {

            double a = entrada.nextDouble();
            double b = entrada.nextDouble();
            double c = entrada.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);

        }


    }
}
