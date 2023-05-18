public class Lazer extends Gastos {
    private boolean importante;

    public Lazer(String nome, double valor,boolean importante) {
        super(nome, valor);
    }

    public boolean isImportante() {
        return importante;
    }

    public void setImportante(boolean importante) {
        this.importante = importante;
    }

    public void mudarValor(double valor) {
        valor = (valor*21)/20;
    }
}
