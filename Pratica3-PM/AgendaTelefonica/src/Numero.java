public enum Numero {
    UM(1),
    DOIS(2),
    TRES(3),
    QUATRO(4),
    CINCO(5);

    private final int valor;

    Numero(int valor) {
        this.valor = valor;
    }

    public int getValor(){
        return this.valor;
    }
}
