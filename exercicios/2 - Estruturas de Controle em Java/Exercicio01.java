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

    public static void main(String[] args){
        var sc = new Scanner(System.in);
        System.out.print("Num: ");
        var num = sc.nextInt();
        sc.nextLine();

        for (int i=0;i<10;i++){
            int res = num * i;
            System.out.println(num + " * "+ i + " = " + res);
        }

    }
}
