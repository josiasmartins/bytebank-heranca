public class TesteTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 222);
        cc.deposita(100.00);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadoraDeImposto calc = new CalculadoraDeImposto();
        calc.registra(cc);
        calc.registra(seguro);

        Console.logPulaLina(calc.getTotalImposto());

    }

}
