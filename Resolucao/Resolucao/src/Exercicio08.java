import java.util.Scanner;

public class Exercicio08 {

    /*********************
     *
     * -- Estrutura de controle em Java --
     *
     *  Escreva um código onde o usuário informa um número inicial,
     *  posteriormente irá informar outros N números,
     *  a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de  0 na divisão,
     * números menores que o primeiro número devem ser ignorados
     *
     *********************/

    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
        
        System.out.print("num: ");
        var num = sc.nextInt();

        String conta = "sim";

        do {

            System.out.print("Divisor: ");
            var num2 = sc.nextInt();

            if(num2 <= num){
                System.out.println("Numero ignorado!");
            }

            else{
                if(num2 % num != 0){
                    conta = "nao";
                }
            }

            

        } while (conta == "sim");

        System.out.println("Fim do programa!");

    }

}
