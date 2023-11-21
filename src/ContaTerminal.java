import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        double saldo = 237.48;

        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Por favor, digite o numero da sua agencia");
        int agencia = scanner.nextInt();

        System.out.println("Agora digite o número da sua conta, e não se esqueça do dígito");
        String conta = scanner.next();

        System.out.println("Estamos quase lá! Agora digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Seu sobrenome...");
        String sobrenome = scanner.next();

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$" + saldo + " ja está disponível para saque.");

    }

}