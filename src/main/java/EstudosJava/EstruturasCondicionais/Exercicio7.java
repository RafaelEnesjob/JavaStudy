package EstudosJava.EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        char genero;
        double peso;
        double altura;

        System.out.println("Informe o genero: ");
        System.out.println("F para Mulheres ou M para Homens ");
        String input = entrada.nextLine();
        genero = input.charAt(0);

        System.out.println("Informe altura: ");
        altura = entrada.nextDouble();

        System.out.println("Informe o peso: ");
        peso = entrada.nextDouble();

        RegraIMC chamarRegraIMC = new RegraIMC();

        double imc = chamarRegraIMC.calcularIMC(peso, altura);
        System.out.printf("IMC Calculado: %.2f%n", imc);


        if (genero == 'F') {
            chamarRegraIMC.classificarIMCMulheres(imc);
        } else if (genero == 'M') {
            chamarRegraIMC.classificarIMCHomens(imc);
        } else {
            System.out.println("Genero invalido");
        }
        entrada.close();
    }

}
