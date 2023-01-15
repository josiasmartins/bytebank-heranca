// Gerente é um funcionario ou Gerente herda da classe Fucionario, assina o contrato autentivel;
public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }

    public double getBonificacao() {
        Console.logPulaLina("Chamando o boneficacao do GERENTE");
        // super.: fica explicito que a propriedade salario é da classe mae
        return super.getSalario();
    }


    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
