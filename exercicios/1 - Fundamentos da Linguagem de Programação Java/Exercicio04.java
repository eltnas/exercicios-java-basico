import java.util.Scanner;

public class Exercicio04 {

    /*************************************************************
     *
     *  -- Fundamentos da Liguagem de Programação Java --
     *
     * Escreva um código que receba o nome e a idade de 2 pessoas
     * e imprima a diferença de idade entre elas
     *
     **************************************************************/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pessoa 01: ");
        var pessoa1 = sc.nextLine();

        System.out.print("Idade: ");
        var idadePessoa1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Pessoa 02: ");
        var pessoa2 = sc.nextLine();

        System.out.print("Idade: ");
        var idadePessoa2 = sc.nextInt();
        sc.nextLine();
        System.out.println(pessoa1 + " tem " + idadePessoa1 + " anos");
        System.out.println(pessoa2 + " tem " + idadePessoa2 + " anos");

        if (idadePessoa1 > idadePessoa2) {
            var diferencaIdade = idadePessoa1 - idadePessoa2;
            System.out.printf("\n%s é %d anos mais velho que %s", pessoa1, diferencaIdade, pessoa2);
        }
        else if (idadePessoa2 > idadePessoa1) {
            var diferencaIdade = idadePessoa2 - idadePessoa1;
            System.out.printf("\n%s é %d anos mais velho que %s", pessoa2, diferencaIdade, pessoa1);
        }
        else {
            System.out.printf("\n%s e %s tem a mesma idade", pessoa1, pessoa2);
        }
    }
}
