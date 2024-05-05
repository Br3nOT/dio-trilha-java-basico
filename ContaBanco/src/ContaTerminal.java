import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta: ");
        int numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agência com dígito e sem espaços: ");
        int numeroAgencia = scanner.nextInt();
        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.next();
        System.out.println("Por favor, digite o seu sobrenome: ");
        String sobrenomeCliente = scanner.next();
        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.print("Olá " + nomeCliente + " " + sobrenomeCliente + " obrigado por criar uma conta em nosso banco, sua agência ");
        System.out.println("é: " + (numeroAgencia/10) + "-" + (numeroAgencia%10)+ ", conta: " + numeroConta + " e seu saldo, R$ " + saldo + " já está disponível para saque.");
        
        scanner.close();
         

    }
}
