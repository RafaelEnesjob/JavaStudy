package EstudosJava.EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Informe um numero: ");
        numero = entrada.nextInt();

        if (numero > 0) {
            System.out.println("Numero Positivo");
        } else if (numero < 0) {
            System.out.println("Numero negativo");
        } else {
            System.out.println("Numero zero");
        }


    }
}
