public class ContaPoupanca extends Conta {
    private double taxa;

    public ContaPoupanca(String numero, String titular, double saldo, double taxa) {
        super(numero, titular, saldo);
        this.taxa = taxa;
    }

    public double getTaxa() { return taxa; }
    public void setTaxa(double taxa) { this.taxa = taxa; }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Rendimento mensal: " + taxa + "%");
    }

    public void mostrarDados(boolean anual) {
        mostrarDados();
        if (anual) {
            System.out.println("Rendimento anual (aproximado): " + (taxa * 12) + "%");
        }
    }
}