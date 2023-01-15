package testes_enums;

// enums: são constantes que não muda;
public enum Prioridade {

    MIN(1), NORMAL(5), MAX(10);

    public int valor;

    Prioridade(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }

}
