import java.time.OffsetDateTime;
import java.util.Scanner;

public class Exercicio01 {

    /*********************
     *
     * -- Fundamentos da Liguagem de Programação Java --
     *
     *  Escreva um código que receba o nome e o ano de nascimento de alguém
     *  e imprima na tela a seguinte mensagem:
     *
     *      "Olá 'Fulano' você tem 'X' anos"
     *
     *********************/

    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        OffsetDateTime anoAtual = OffsetDateTime.now();
        System.out.print("Qual o seu nome: ");
        var nome = sc.nextLine();
        System.out.print("Em que ano nasceu: ");
        var anoNasc = sc.nextInt();
        var idade = anoAtual.getYear() - anoNasc;
        System.out.printf("\n\nSeja bem vindo %s, você tem %s anos", nome, idade);
    }
}
