import java.util.Scanner;

public class Exercicio03 {

    /******************************************************************
     *
     *  -- Fundamentos da Liguagem de Programação Java --
     *
     *  Escreva um código que receba a base e a altura de um retângulo,
     *  calcule sua área e exiba na tela
     *
     *     - fórmula: área=base X altura
     *
     ******************************************************************/

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("base: ");
        Float base = sc.nextFloat();

        System.out.println("altura: ");
        Float altura = sc.nextFloat();

        var area = base * altura;
        System.out.println("\nA area total é de: " + area);
    }
}
