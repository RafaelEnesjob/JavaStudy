package EstudosJava.EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Informe um numero para saber se é par ou impar: ");
        numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }
}
