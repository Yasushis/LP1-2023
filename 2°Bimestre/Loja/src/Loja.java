import java.util.ArrayList;
import java.util.List;

public class Loja {

    private String nome;
    private List<Cliente> clientes = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();

    public Loja(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void addClientes(Cliente cliente) {
        clientes.add(cliente);
    }

    public void setClientes(List<Cliente>clientes) {
        this.clientes = clientes;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void addPedidos(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void setPedidos(List<Pedido>pedidos) {
        this.pedidos = pedidos;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

}
