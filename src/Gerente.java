// Gerente é um funcionario ou Gerente herda da classe Fucionario, assina o contrato autentivel;
public class Gerente extends Funcionario implements Autenticavel {

    private int senha;

    public double getBonificacao() {
        Console.logPulaLina("Chamando o boneficacao do GERENTE");
        // super.: fica explicito que a propriedade salario é da classe mae
        return super.getSalario();
    }


    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) return true;

        return false;
    }
}
