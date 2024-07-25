package EstudosJava.EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int x;
        int y;
        int operacao;

        System.out.println("CALCULADORA");

        System.out.println("OPCOES: ");

        System.out.println("1 - SOMA");
        System.out.println("2 - SUBTRACAO");
        System.out.println("3 - MULTIPLICACAO");
        System.out.println("4 - DIVISAO");

        System.out.println("Qual operacao deseja realizar? ");

        operacao = entrada.nextInt();

        System.out.println("Informe o primeiro numero: ");
        x = entrada.nextInt();
        System.out.println("Informe o segundo numero: ");
        y = entrada.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Resultado da soma = " + (x + y));
                break;
            case 2:
                System.out.println("Resultado da subtracao = " + (x - y));
                break;
            case 3:
                System.out.println("Resultado da multiplicacao = " + (x * y));
                break;
            case 4:
                if (y != 0) {
                    System.out.println("Resultado da divisao = " + (x / y));
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Operacao invalida.");
                break;
        }
        entrada.close();
    }
}
