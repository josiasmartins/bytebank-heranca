public class TesteContas {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1111, 1111);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(22, 22);
        cp.deposita(200);

        cc.transfere(10.0, cp);

        Console.logPulaLina("CC " + cc.getSaldo());
        Console.logPulaLina("CP " + cp.getSaldo());

    }
}
