package EstudosJava.TabelaVerdade;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String senha = "senha123";
        String senhaInformada;
        boolean usuarioBloqueado = false;

        System.out.println("Informe a senha: ");
        senhaInformada = entrada.nextLine();

        if (senhaInformada.equals(senha) && !usuarioBloqueado) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Senha incorreta ou usuario bloqueado");
        }

    }
}
