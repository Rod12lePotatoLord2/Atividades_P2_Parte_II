public class Conta {
    private String numero;
    private String titular;
    private double saldo;

    public Conta(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumero() { return numero; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }

    public void setNumero(String numero) { this.numero = numero; }
    public void setTitular(String titular) { this.titular = titular; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public void mostrarDados() {
        System.out.println("Conta: " + numero + " | Titular: " + titular + " | Saldo: R$" + saldo);
    }

    public void mostrarDados(double projecao) {
        mostrarDados();
        double saldoProjetado = saldo * (1 + projecao / 100);
        System.out.println("Saldo projetado (+ " + projecao + "%): R$" + saldoProjetado);
    }
}