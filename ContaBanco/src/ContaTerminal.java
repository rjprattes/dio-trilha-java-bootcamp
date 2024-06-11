import java.util.Locale;
import java.util.Scanner;   

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Double saldo = 235.81;

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Agora digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Olá Rogeres, seja bem vindo ao nosso banco, sua agencia é "+ agencia + ", conta " + numeroConta + ", seu saldo atual é de " + saldo);
       
    }
}
