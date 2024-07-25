package EstudosJava.EstruturasRepetitivas;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int senha;

        System.out.println("Informe a senha correta: ");
        senha = entrada.nextInt();

        while (senha != 2022) {
            System.out.println("Senha incorreta, informe novamente");
            senha = entrada.nextInt();
        }
        System.out.println("Acesso liberado");

        entrada.close();
    }
}
