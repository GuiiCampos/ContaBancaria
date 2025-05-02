import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, bem vindo a Conta Banco");

        System.out.print("Por favor, digite o número da conta:\n");
        int numero = sc.nextInt();

        System.out.print("Digite o número da agência:\n");
        String agencia = sc.next();

        System.out.print("Digite seu nome completo:\n");
        String nomeCliente = sc.next();

        sc.nextLine();

        System.out.print("Digite seu saldo:\n");
        double saldo = sc.nextDouble();

        ContaTerminal cliente1 = new ContaTerminal(numero, agencia, nomeCliente, saldo);
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                cliente1.getNomeCliente(),
                cliente1.getAgencia(),
                cliente1.getNumero(),
                cliente1.getSaldo()
        );

        sc.close();
    }
}