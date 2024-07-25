package EstudosJava.EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nota;

        System.out.println("Informe uma nota: ");
        nota = entrada.nextInt();

        switch (nota) {
            case 10:
                System.out.println("A");
                break;
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("A");
                break;
            case 7:
                System.out.println("B");
                break;
            case 6:
                System.out.println("B");
                break;
            case 5:
                System.out.println("C");
                break;
            case 4:
                System.out.println("C");
                break;
            case 3:
                System.out.println("D");
                break;
            case 2:
                System.out.println("D");
                break;
            case 1:
                System.out.println("F");
                break;
            case 0:
                System.out.println("F");
                break;

        }

    }
}
