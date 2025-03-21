import java.util.Scanner;

public class ContaTerminal {    
    public static void main(String[] args) {
        
        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira sua conta: ");
        conta.numeroConta = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Por favor, insira sua Agência: ");
        conta.agencia = scanner.nextLine();
        
        System.out.println("Por favor, insira seu nome: ");
        conta.nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, insira seu saldo: ");
        conta.saldo = scanner.nextDouble();

        scanner.close();
        
        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco.%n", conta.nomeCliente);
        System.out.printf("Sua agência é %s, conta %d e seu saldo %.210f já está disponível para saque", conta.agencia, conta.numeroConta, conta.saldo);
    }

}

class Conta{
    String  nomeCliente;
    String agencia;
    int numeroConta;
    double saldo;
}
