// não pode instanciar dessa classe, porque é abstract
public abstract class Funcionario {

    private String nome;
    private String cpf;

    // protected: visivel somente para classes filhos
    private double salario;
    private int tipo = 0;  // comum (0), gerente (1)

    // método sem corpo, não a implementação
    public abstract double getBonificacao();

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
