public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario nico = new Funcionario();
        nico.setNome("Nico Steppat");
        nico.setCpf("22222222");
        nico.setSalario(2590.80);

        Console.logPulaLina(nico.getName());
        Console.logPulaLina(nico.getBonificacao());

    }
}
