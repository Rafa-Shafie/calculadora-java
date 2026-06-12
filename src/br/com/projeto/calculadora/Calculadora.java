package br.com.projeto.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.print("Informe o segundo numero: ");
        double segundoNumero = scanner.nextDouble();

        System.out.println("Escolha a operacao (soma, subtracao, multiplicacao, divisao, potencia):");
        String entradaUsuario = scanner.next();

        // Mandei o texto puro para o meu Enum tentar traduzir
        Operacao operador = Operacao.deString(entradaUsuario);

        // Validação de segurança: se o Enum me devolveu INVALIDA, eu paro o programa logo aqui, assim evito gastar processador a toa fazendo calculos com uma operacao que nem existe
        if (operador == Operacao.INVALIDA) {
            System.out.println("\n[ERRO] '" + entradaUsuario + "' não é uma operação válida.");
            System.out.println("Tente rodar de novo e escolha entre: soma, subtracao, multiplicacao, divisao ou potencia.\n");
            return;
        }

        // Tratamento de excessao para divisao com denominador zero
        if (operador == Operacao.DIVISAO && segundoNumero == 0) {
            System.out.println("\n[ERRO] Matematica basica, ne? Não dá para dividir por zero!\n");
            return;
        }

        // Switch Expression (recurso moderno do Java).
        double resultado = switch (operador) {
            case SOMA -> primeiroNumero + segundoNumero;
            case SUBTRACAO -> primeiroNumero - segundoNumero;
            case MULTIPLICACAO -> primeiroNumero * segundoNumero;
            case DIVISAO -> primeiroNumero / segundoNumero;
            case POTENCIA -> Math.pow(primeiroNumero, segundoNumero);
                default -> 0; // questão de segurança
        };

        // Formatando com %.2f para a saida se limitar a duas casas decimais
        System.out.printf("%n[SUCESSO] Resultado da %s = %.2f%n", operador, resultado);
    }
}