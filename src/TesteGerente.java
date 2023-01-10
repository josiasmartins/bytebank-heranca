public class TesteGerente {

    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Marco");
        g1.setCpf("2222222");
        g1.setSalario(5000.00);

        Console.logPulaLina(g1.getName());
        Console.logPulaLina(g1.getCpf());
        Console.logPulaLina(g1.getSalario());

        g1.setSenha(2222);
        boolean autinticou = g1.autentica(2222);

        Console.logPulaLina(autinticou);
    }
}
