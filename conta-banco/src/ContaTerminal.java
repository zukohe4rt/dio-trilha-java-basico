import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o numero da Agencia !: ");
        numero = input.nextInt();

        System.out.println("Por favor, digite o nome da Agencia !: ");
        agencia = input.next();

        System.out.println("Por favor, digite o seu nome!: ");
        input.nextLine(); // Consuma a quebra de linha pendente
        nomeCliente = input.nextLine();

        System.out.println("Por favor, digite o seu saldo!: ");
        saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
