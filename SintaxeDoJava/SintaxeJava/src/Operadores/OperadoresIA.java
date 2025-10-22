package Operadores;

public class OperadoresIA {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;

        //Operadores Aritméticos
        int soma = numero1 + numero2;
        int subtracao = numero2 - numero1;
        int multiplicacao = numero1 * numero2;
        int divisao = numero2 / numero1;
        int modulo = numero2 % numero1;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);

        //Operadores Relacionais
        boolean isMaior = numero2 > numero1;
        boolean isMenor = numero1 < numero2;
        boolean isIgual = numero1 == numero2;
        boolean isDiferente = numero1 != numero2;

        System.out.println("Número 2 é maior que Número 1? " + isMaior);
        System.out.println("Número 1 é menor que Número 2? " + isMenor);
        System.out.println("Número 1 é igual a Número 2? " + isIgual);
        System.out.println("Número 1 é diferente de Número 2? " + isDiferente);
    }
}
