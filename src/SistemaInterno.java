public class SistemaInterno {

    private int senha = 222;

    public void autentica(Autenticavel g) {
        boolean autenticou = g.autentica(this.senha);

        if (autenticou) {
            Console.logPulaLina("Pode entrar no sistema");
        } else {
            Console.logPulaLina("Não pode entrar no sistema");
        }
    }
}
