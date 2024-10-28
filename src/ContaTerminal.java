import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int numero = 0;
        String agencia;
        String nomeCliente;
        double saldo = 0;
    
       

        System.out.println("Pro favor, digite seu nome");
        nomeCliente = scanner.next();

        System.out.println("Pro favor, digite a agência, exemplo: 000-0");
        agencia = scanner.next();

        System.out.println("Pro favor, digite o numero da agencia, exemplo: 0000");
        numero = scanner.nextInt();

        System.out.println("Pro favor, digite o valor que deseja depositar");
        saldo = scanner.nextDouble();

        System.out.println("Olá [" + nomeCliente + "], obrigado por criar uma conta em nosso banco!");
        System.out.println("Aqui estão seus dados:");
        System.out.println("agencia: " + agencia );
        System.out.println("conta : " + numero );
        System.out.println("saldo : " + saldo);
        System.out.println("saldo disponivel para saque : " + saldo);


    }
}
