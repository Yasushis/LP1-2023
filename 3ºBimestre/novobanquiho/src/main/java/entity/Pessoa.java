package entity;

import jakarta.persistence.*;

@Entity
@Table
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String nome;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereço id")
    private Endereço endereço;

    public Pessoa(String nome, Endereço endereço) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
