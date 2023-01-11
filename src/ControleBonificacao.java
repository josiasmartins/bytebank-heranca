public class ControleBonificacao {

    private double soma;

    // tipo generico (Funcionario f)
    public void registra(Funcionario f) {
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
    }

    public double getSoma() {
        return soma;
    }
}
