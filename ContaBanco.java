import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        ContaTerminal novaConta = new ContaTerminal();
        
        System.out.println("Digite seu nome: ");
        novaConta.setNomeCliente(scanner.nextLine());

        System.out.println("Digite o numero da sua Agência: ");
        novaConta.setAgencia(scanner.nextLine());

        System.out.println("Digite o numero da sua Conta: ");
        novaConta.setNumero(scanner.nextInt());

        System.out.println("Digite o seu Saldo: ");
        novaConta.setSaldo(scanner.nextDouble());

        System.out.println("Olá "+novaConta.getNomeCliente()+", obrigado por criar uma conta em nosso banco, sua agência é "+novaConta.getAgencia()+", conta "+novaConta.getNumero()+" e seu saldo "+novaConta.getSaldo()+" já está disponível para saque.");
        
    }
}
