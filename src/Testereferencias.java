public class Testereferencias {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
       g1.setSalario(5000.00);

       Funcionario f = new Funcionario();
       f.setSalario(2000.00);

       EditorVideo ev = new EditorVideo();
       ev.setSalario(2500.00);

       Designer designer = new Designer();
       designer.setSalario(2000.90);

       ControleBonificacao controle = new ControleBonificacao();
       controle.registra(g1);
       controle.registra(f);
       controle.registra(ev);
       controle.registra(designer);

       Console.logPulaLina(controle.getSoma());

    }
}
