package EstudosJava.EstruturasRepetitivas;

import java.util.Scanner;

public class Ex02Test {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int codigoCombustivel;

        System.out.println("Informe o código do combustivel: ");
        codigoCombustivel = entrada.nextInt();

        while (codigoCombustivel != 4) {
            switch (codigoCombustivel) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
            }

        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
