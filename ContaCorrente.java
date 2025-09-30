public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String numero, String titular, double saldo, double limite) {
        super(numero, titular, saldo);
        this.limite = limite;
    }

    public double getLimite() { return limite; }
    public void setLimite(double limite) { this.limite = limite; }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Limite do cheque especial: R$" + limite);
    }

    public void mostrarDados(boolean detalhar) {
        mostrarDados();
        if (detalhar) {
            double totalDisponivel = getSaldo() + limite;
            System.out.println("Saldo disponível (saldo + limite): R$" + totalDisponivel);
        }
    }
}