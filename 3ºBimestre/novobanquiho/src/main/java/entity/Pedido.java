package entity;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private Pessoa pessoa;
    @Column
    private ArrayList<Produto> produtos;

    public Pedido(Pessoa pessoa, ArrayList<Produto> produtos) {
        this.pessoa = pessoa;
        this.produtos = produtos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}
