public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;
    private int tipo = 0;  // comum (0), gerente (1)

    public double getBonificacao() {
        if (this.tipo == 0) return this.salario * 0.1;
        if (this.tipo == 1) return this.salario;

        return this.tipo + 1000;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getName() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
