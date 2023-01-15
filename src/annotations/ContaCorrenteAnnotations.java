package annotations;

public class ContaCorrenteAnnotations extends ContaAnnotations {

    @Override
    public void deposita(double valor) {
        super.salario += valor - 1;
    }

}
