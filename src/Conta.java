public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente_part_1 titular;
    private static int total = 0;

    public Conta(int agencia, int numero) {
        Conta.total++;
        //Console.logPulaLina("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        //Console.logPulaLina("Estou criando uma conta " + this.numero);
    };

    public abstract void deposita(double valor);

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }

        return false;
    };

    public boolean transfere(double valor, Conta destino) {
        if(this.saca(valor)) {
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente_part_1 getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente_part_1 titular) {
        this.titular = titular;
    }
}
