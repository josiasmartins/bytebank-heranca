public class Designer extends Funcionario {

    public double getBonificacao() {
        Console.logPulaLina("chamando o método do bonificação do designer");
        return super.getBonificacao() + 200;
    }
}
