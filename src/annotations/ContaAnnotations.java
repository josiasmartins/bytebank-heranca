package annotations;

/*
 *
 * @author Nico
 * @version 1.0
 * */
public class ContaAnnotations {

    @DoublePositivo
    protected double salario;
    private String titular;
    private String banco;
    private String agencia;
    private String numero;

    public void deposita(double salario) {
        this.salario += salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public  String getBanco() {
        return this.banco;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
}
