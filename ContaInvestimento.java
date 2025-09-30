public class ContaInvestimento extends Conta {
    private double taxaAdministracao;

    public ContaInvestimento(String numero, String titular, double saldo, double taxaAdm) {
        super(numero, titular, saldo);
        this.taxaAdministracao = taxaAdm;
    }

    public double getTaxaAdministracao() { return taxaAdministracao; }
    public void setTaxaAdministracao(double taxaAdministracao) { this.taxaAdministracao = taxaAdministracao; }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Taxa de administração: " + taxaAdministracao + "%");
    }

    public void mostrarDados(boolean considerarProjecao, double projecao) {
        mostrarDados();
        if (considerarProjecao) {
            double saldoProjecao = getSaldo() * (1 + projecao / 100);
            double saldoFinal = saldoProjecao * (1 - taxaAdministracao / 100);
            System.out.println("Saldo após projeção e taxa de administração: R$" + saldoFinal);
        }
    }
}