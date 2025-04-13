import java.util.Locale;
import java.util.Scanner;

/**
 * <h1>ContaTerminal</h1>
 *
 * Simula uma um terminal bancário
 * Classe responsável por simular uma aplicação de criação de conta bancária
 * que recebe dados do usuário via terminal e exibe mensagem com os dados da conta.
 *
 * @author Danilo Faria
 * @version 1.0
 * @since 2025-04-13
 */
public class ContaTerminal {

    /**
     * Método main
     * @param args argumentos de linha de comando (não utilizo)
     */
    public static void main(String[] args) {

        try {
            intergirNoTerminal();
        }
        catch (Exception e){
            System.err.println("Ops.! Alguma coisa falhou. Verifique se digitou as informações e números no formato correto!");
        }

    }

    /**
     * Método intergirNoTerminal
     * Usa o terminal para usuário interagir sobre sua conta bancária
     * <h3>Detalhe para as formatações no final:</h3>
     * <p>%06d - formata o número com 6 dígitos preenchidos com zeros à esquerda</p>
     * <p> %,.2f - formata o número com separador de milhar e 2 casas decimais</p>
     *
     */
    private static void intergirNoTerminal(){
        // criando scanner no terminal

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            // variáveis conforme tipo indicado no enunciado
            // https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe

            int numero;
            String agencia;
            String nomeCliente;
            double saldo;

            // número da agência
            System.out.println("Por favor, digite o número da Agência (exemplo: 067-8)!");
            agencia = scanner.nextLine();

            // número da conta
            System.out.println("Por favor, digite o número da Conta (exemplo: 1021)!");
            numero = scanner.nextInt();
            scanner.nextLine();

            // nome do cliente
            System.out.println("Por favor, digite o seu nome (exemplo: MARIO ANDRADE)!");
            nomeCliente = scanner.nextLine();

            // pegar o saldo
            System.out.println("Por favor, digite o saldo inicial da conta (exemplo: 237.48)!");
            saldo = scanner.nextDouble();

            // aqui estou formatando antes,pois consigo colocar máscara nos números e separa código melhor
            String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, " +
                            "sua agência é %s, conta %06d e seu saldo %,.2f" +
                            " já está disponível para saque.",
                    nomeCliente, agencia, numero, saldo);

            // mostrando msg
            System.out.println(mensagem);
        }

    }
}