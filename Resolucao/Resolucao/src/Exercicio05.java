import java.util.Scanner;

public class Exercicio05 {

    /*********************
     *
     * -- Estrutura de controle em Java --
     *
     *  Escreva um código onde o usuário entra com um número
     *  e seja gerada a tabuada de 1 até 10 desse número;
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
