public class Variavel extends Gastos {
    private int tempoMeses;

    public Variavel(String nome, double valor, int tempoMeses)
    {
        super(nome, valor);
    }

    public int getTempoMeses() {
        return tempoMeses;
    }

    public void setTempoMeses(int tempoMeses) {
        this.tempoMeses = tempoMeses;
    }
}
