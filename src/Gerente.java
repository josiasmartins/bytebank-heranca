// Gerente é um funcionario ou Gerente herda da classe Fucionario;
public class Gerente extends Funcionario {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) return true;

        return false;
    }

    public double getBonificacao() {
        // super.: fica explicito que a propriedade salario é da classe mae
        return super.getBonificacao() + super.getSalario();
    }


}
