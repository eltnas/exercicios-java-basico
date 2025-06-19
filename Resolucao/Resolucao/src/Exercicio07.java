import java.util.Scanner;

public class Exercicio07 {

    /*********************
     *
     * -- Estrutura de controle em Java --
     *
     *  Escreva um código que o usuário entre com um primeiro número,
     *  um segundo número maior que o primeiro e escolhe entre a opção par e impar,
     *  com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) 
     *  no intervalo de números informados, incluindo os números informados e em ordem decrescente;
     *
     *********************/

    public void contaNumero(){
        var sc = new Scanner(System.in);
        int num1, num2;
        String op;

        do {
            System.out.print("num1: ");
            num1 = sc.nextInt();
            sc.nextLine();

            System.out.print("num2: ");
            num2 = sc.nextInt();
            sc.nextLine();

            if(num1 >= num2){
                System.out.println("Erro: O sengundo numero não pode ser maior que o primeiro. ");
            }
        } while (num1 >= num2);

        do{
            System.out.print("Par (p) ou Impar(i): ");
            op = sc.nextLine().toLowerCase();

            if (!op.equals("p") && !op.equals("i")){
                System.out.print("Opção inválida!");
            }
        } while (!op.equals("p") && !op.equals("i"));

        switch (op) {
            case "p":
                for(int i=num2;i >= num1; i--){
                    if(i % 2 == 0) {
                        System.out.print(i + "\n");
                    }
                }                
                break;

            case "i":
                for(int i=num2;i >= num1; i--){
                    if(i % 2 == 1) {
                        System.out.print(i + "\n");
                    }
                }                
                break;
        
            default:
                System.out.println("Valor invalido!");
                break;
        }
    }

    public static void main(String[] args){
        var obj = new Exercicio07();
        obj.contaNumero();
    }

}
