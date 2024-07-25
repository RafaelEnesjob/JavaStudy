package EstudosJava.EstruturasRepetitivas;

import java.util.Scanner;

public class Ex01For {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int x;

        System.out.println("informe um numero: ");
        x = entrada.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println("Numeros impares: " + i);
            }
        }
        entrada.close();
    }
}
