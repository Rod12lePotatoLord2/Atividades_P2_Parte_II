import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        String nome = "";
        do {
            System.out.println("\nBom dia, o que você quer fazer hoje?");
            System.out.println("1 - Acessar a Conta Corrente");
            System.out.println("2 - Acessar a Conta Poupança");
            System.out.println("3 - Acessar Conta Investimento");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 0) break;

            System.out.print("Por favor, insira o número da sua conta: ");
            String numero = sc.nextLine();
            System.out.print("Informe o seu nome: ");
            nome = sc.nextLine();
            System.out.print("Quanto você tem de saldo no momento? ");
            double saldo = sc.nextDouble();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Você possui algum limite no cheque especial? Quanto? ");
                    double limite = sc.nextDouble();
                    ContaCorrente cc = new ContaCorrente(numero, nome, saldo, limite);

                    System.out.print("Gostaria de ver o seu saldo disponível, com esse limite? (true/false): ");
                    boolean mostrarDetalhes = sc.nextBoolean();
                    cc.mostrarDados(mostrarDetalhes);
                    break;

                case 2:
                    System.out.print("Qual é a taxa de rendimento da sua poupança? ");
                    double taxaPoupanca = sc.nextDouble();
                    ContaPoupanca cp = new ContaPoupanca(numero, nome, saldo, taxaPoupanca);

                    System.out.print("Gostaria de saber o seu rendimento anual? (true/false): ");
                    boolean mostrarAnual = sc.nextBoolean();
                    cp.mostrarDados(mostrarAnual);
                    break;

                case 3:
                    System.out.print("Qual a taxa de administração? ");
                    double taxaAdm = sc.nextDouble();
                    ContaInvestimento ci = new ContaInvestimento(numero, nome, saldo, taxaAdm);

                    System.out.print("Devo considerar uma projeção? (true/false): ");
                    boolean considerarProjecao = sc.nextBoolean();
                    double projecao = 0;
                    if (considerarProjecao) {
                        System.out.print("Qual é a projeção mensal? ");
                        projecao = sc.nextDouble();
                    }
                    ci.mostrarDados(considerarProjecao, projecao);
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        } while (opcao != 0);

        System.out.println("Obrigado(a), " + nome + ", até a próxima! Tenha um bom dia!");
        sc.close();
    }
}