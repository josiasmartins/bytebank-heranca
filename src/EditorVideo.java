public class EditorVideo extends Funcionario {

    public double getBonificacao() {
        Console.logPulaLina("chamando o método do bonificação do editor de video");
        return super.getBonificacao() + 100;
    }
}
