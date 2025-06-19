import java.util.Scanner;

public class Exercicio02 {

    /*********************
     *
     *  -- Fundamentos da Liguagem de Programação Java --
     *
     * Escreva um código que receba o tamanho do lado de um quadrado,
     * calcule sua área e exiba na tela
     *
     *    - fórmula: área=lado X lado
     *
     *********************/

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Tamanho: ");
        Float tamanho = sc.nextFloat();

        var area = tamanho * tamanho;
        System.out.printf("\nA area total é de: %s", area);
    }
}
