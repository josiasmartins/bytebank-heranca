public class Teste {

    public static void main(String[] args) {
        FuncionarioTeste f1 = new FuncionarioTeste();
        f1.setSalario(3000.00);
        Console.logPulaLina(f1.getTipo());
        Console.logPulaLina(f1.getBonificacao());

        FuncionarioTeste f2 = new FuncionarioTeste();
        f2.setTipo(1);
        f2.setSalario(5000.00);
        Console.logPulaLina(f2.getTipo());
        Console.logPulaLina(f2.getBonificacao());
    }
}
