package EstudosJava.EstruturasCondicionais;

public class RegraIMC {

    //TODO Calcular o IMC utilizando a fórmula: IMC = peso / (altura * altura)
    //Entrada: peso e altura
    //Saida: usando a formula do calculo
    public double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    //TODO Determinar a condição do IMC com base nas tabelas fornecidas:
    //TODO Para Mulheres:
    //Abaixo do peso: IMC < 19.1
    //No peso ideal: 19.1 <= IMC <= 25.8
    //Um pouco acima do peso: 25.9 <= IMC <= 27.3
    //Acima do peso ideal: 27.4 <= IMC <= 32.3
    //Obeso: IMC > 32.3
    //Exibir o IMC calculado e a condição correspondente na tela.

    //else if nao funciona com || OU
    //TODO sempre pensar no objetivo dos métodos



    public void classificarIMCMulheres(double imc) {
        if (imc < 19.1) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 19.1 && imc <= 25.8) {
            System.out.println("Peso ideal");
        } else if (imc >= 25.9 && imc <= 27.3) {
            System.out.println("Um pouco acima do peso");
        } else if (imc >= 27.4 && imc <= 32.3) {
            System.out.println("Acima do peso ideal");
        } else if (imc > 32.3) {
            System.out.println("Obesa");
        }
    }


    //TODO Para Homens:
    //Abaixo do peso: IMC < 20.7
    //No peso ideal: 20.8 <= IMC <= 26.4
    //Um pouco acima do peso: 26.5 <= IMC <= 27.8
    //Acima do peso ideal: 27.9 <= IMC <= 31.1
    //Obeso: IMC > 31.1
    //Saída de Dados:
    //Exibir o IMC calculado e a condição correspondente na tela.

    public void classificarIMCHomens(double imc) {
        if (imc < 20.7) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 26.4) {
            System.out.println("No peso ideal");
        } else if (imc <= 27.8) {
            System.out.println("Um pouco acima do peso");
        } else if (imc <= 31.1) {
            System.out.println("Acima do peso ideal");
        } else {
            System.out.println("Obeso");
        }
    }
}


