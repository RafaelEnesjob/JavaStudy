package EstudosJava.EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int idade;

        System.out.println("Informe a idade: ");
        idade = entrada.nextInt();

        if (idade >= 18) { // caso false ai caira no else
            System.out.println("Maior de idade");
        }
        else {
            System.out.println("Menor de idade");
        }
    }
}
