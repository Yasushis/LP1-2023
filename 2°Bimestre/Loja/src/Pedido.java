public class Pedido {

    private Cliente cliente;
    private String produto;
    private float valor;
    private int codigo;

    public Pedido(Cliente cliente, String produto, float valor, int codigo) {
        this.cliente = cliente;
        this.produto = produto;
        this.valor = valor;
        this.codigo = codigo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
    
}
