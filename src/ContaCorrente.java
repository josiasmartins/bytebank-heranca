public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero) {
        // chamado do constructor da classe mãe
        super(agencia, numero);
    }

    // override: sobreescreve o comportamento dos métodos
    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

    @Override
    public void deposita(double valor) {
        super.saldo = super.saldo + valor;
    }
}
