package entity;

import jakarta.persistence.*;

public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Double nota;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "nota-turma", joinColumns = @JoinColumn(name = "nota_id"), inverseJoinColumns = @JoinColumn(name = "turma_id"))
    private Turma turma;

    public Nota(Double nota) {
        this.nota = nota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "id=" + id +
                ", nota=" + nota +
                '}';
    }
}
