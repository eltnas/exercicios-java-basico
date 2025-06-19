import java.util.Scanner;

public class Exercicio09 {

    /*********************
     *
     * -- Java e a Arte da Abstração com Classes e Encapsulamento --
     *
     *  Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
     * 
     *      -  Consultar saldo
     *      -  consultar cheque especial
     *      -  Depositar dinheiro;
     *      -  Sacar dinheiro;
     *      -  Pagar um boleto.
     *      -  Verificar se a conta está usando cheque especial.
     * 
     *  Siga as seguintes regras para implementar
     * 
     *      - A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
     *      - O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
     *      - Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
     *      - Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.
     *
     *********************/

    private Scanner sc = new Scanner(System.in);
    private Double saldo = 0.00;
    private Double chequeEspecial = 0.00;
    private Double usoChequeEspecial = 0.00;

    public double getSaldo() {
        return this.saldo;
    }

    public double getChequeEspecial() {
        return this.chequeEspecial;
    }

    public void setSaldo(double entSaldo){
        if (entSaldo >= 0){
            this.saldo = entSaldo;
            System.out.println("Novo saldo: " + this.saldo);
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void setChequeEspecial(double entChequeEspecial){
        if (entChequeEspecial >= 0){
            this.chequeEspecial = entChequeEspecial;
            System.out.println("Saldo do Cheque Especial: " + this.chequeEspecial);
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void deposito(double valor){
        if (valor >= 0){
            System.out.println("Deposito de R$ " + valor + " efetuado com sucesso!");
            if (this.chequeEspecial < 100){
                Double juros = (this.chequeEspecial - 100) * 1.2;
                valor = valor + juros;
                this.saldo += valor;                
                this.chequeEspecial = 100.00;
                System.out.println("O valor de R$ "+ juros +" foi descontado pois foi usado o cheque especial!");
            } else {
                this.saldo += valor;
            }
            System.out.println("\nNovo saldo: " + this.saldo);
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void saque(double valor) {
        if (valor > 0 && this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " efetuado com sucesso");
            System.out.println("\nNovo saldo: " + this.saldo);
        } else if(valor <= 0 ){
            System.out.println("Valor inválido");
        } else {
            if ((valor - this.saldo) <= this.chequeEspecial ){
                if (this.usoChequeEspecial <= this.chequeEspecial)
                this.saldo -= valor;
                this.chequeEspecial += this.saldo;
                this.saldo = 0.00;
                System.out.println("Saque de R$ " + valor + " efetuado usando o Cheque especial");
                System.out.println("\nNovo saldo: " + this.saldo);
            } else {
                System.out.println("Saldo insuficiente");
            }
        }
    }

    public void boleto(int num, double valor) {
        if (valor > 0 && this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Boleto numero: "+ num + " no valor de R$ " + valor + " pago com sucesso");
            System.out.println("\nNovo saldo: " + this.saldo);
        } else if(valor <= 0 ){
            System.out.println("Valor inválido");
        } else {
            if ((valor - this.saldo) <= this.chequeEspecial ){
                this.saldo -= valor;
                this.chequeEspecial += this.saldo;
                this.saldo = 0.00;
                System.out.println("Boleto valor R$ " + valor + " pago usando o Cheque especial");
                System.out.println("\nNovo saldo: " + this.saldo);
            } else {
                System.out.println("Saldo insuficiente para pagamento de boleto.");
            }
            
        }
    }

    public void exibirMenu(){
        int opMenu = -1;
        Exercicio09 obj = new Exercicio09();

        do{
            System.out.println("\n#************************************");
            System.out.println("#-        Programa bancario         -");
            System.out.println("#************************************");
            System.out.println("#*                                  *");
            System.out.println("#*    1 - Consultar Saldo           *");
            System.out.println("#*    2 - Consultar cheque especial *");
            System.out.println("#*    3 - Depositar dinheiro        *");
            System.out.println("#*    4 - Sacar dinheiro            *");
            System.out.println("#*    5 - Pagar um boleto           *");
            System.out.println("#*                                  *");
            System.out.println("#*                                  *");
            System.out.println("#*    0 - Sair                      *");
            System.out.println("#************************************");
            System.out.println("Função desejada: ");
            opMenu = sc.nextInt();

            switch (opMenu) {
                case 0:
                    
                    System.out.println("\nAté logo!!");
                    break;

                case 1:
                    System.out.println("\n\nSeu saldo é de: R$ " + obj.getSaldo());
                    break;

                case 2:
                    System.out.println("\nSaldo do Cheque Especial é de: R$ " + obj.getChequeEspecial());
                    break;

                case 3:
                    System.out.print("\nValor do deposito: R$ ");
                    var vlDeposito = sc.nextFloat();
                    obj.deposito(vlDeposito);

                    break;

                case 4:
                    System.out.println("\nValor do saque: R$");
                    var vlSaque = sc.nextFloat();
                    obj.saque(vlSaque);
                    break;

                case 5:
                System.out.println("\nNumero do boleto: R$");
                    var numBoleto = sc.nextInt();
                    System.out.println("\nValor do boleto: R$");
                    var vlBoleto = sc.nextFloat();
                    obj.boleto(numBoleto, vlBoleto);
                    break;
            
                default:
                    System.out.println("\nOpção Inválida!!!");
                    break;
            }
        } while (opMenu != 0);
    }

    public void depInicial() {

        System.out.println("Faça o primeiro deposito para abrir a sua conta!");

        System.out.print("\nValor: R$ ");
        var depInicial = sc.nextFloat();

        if(depInicial >= 0.00){
            this.saldo += depInicial;
            if(depInicial > 500.00){
                var valor = depInicial * 0.5;
                this.chequeEspecial += valor;
            } else {
                this.chequeEspecial += 50.0;
            }
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public static void main (String[] args) {
        
        var obj = new Exercicio09();
        obj.depInicial();
        obj.exibirMenu();

    }

}
