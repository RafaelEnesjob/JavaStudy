package EstudosJava.EstruturasCondicionais;

import java.util.Scanner;

/*
TODO: Passos para Implementação
Solicitar a senha ao usuário.
Verificar o comprimento da senha.
Verificar se a senha contém pelo menos uma letra maiúscula.
Verificar se a senha contém pelo menos uma letra minúscula.
Verificar se a senha contém pelo menos um número.
Informar ao usuário se a senha é válida ou não, especificando os critérios que não foram atendidos.

TODO: Criterios
Mínimo 8 caracteres
Pelo menos uma letra maíuscula
Pelo menos uma letra minuscula
Pelo menos um numero

Use length para obter o tamanho de arrays e strings.
Use size para obter o tamanho de coleções como listas, conjuntos, etc.
 */

/*
TODO como validar se uma string que eu informei tem uma letra maiuscula e uma minuscula e um numero.
 */

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String senha;
        final int TAMANHO_SENHA = 8;

        System.out.println("Informe a senha: ");
        senha = entrada.nextLine();

        final String LETRA_MAIUSCULA = senha.toUpperCase();

        if (senha.length() < TAMANHO_SENHA) {
            System.out.println("Senha invalida, informe uma senha com minimo de 8 caracteres");
        }

        else if (senha.contains(LETRA_MAIUSCULA)) {
            System.out.println("Informe pelo menos uma letra maiuscula");
        }
        else {
            System.out.println("Senha validada com sucesso");
        }





    }
}
