package entity;

import jakarta.persistence.*;

import java.util.List;

public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String codigo;
    @Column
    private Integer horario;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "aluno_id")
    private List<Aluno> alunos;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "turma-professor", joinColumns = @JoinColumn(name = "turma_id"), inverseJoinColumns = @JoinColumn(name = "professor_id"))
    private Professor professor;

    public Turma(String codigo, Integer horario) {
        this.codigo = codigo;
        this.horario = horario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getHorario() {
        return horario;
    }

    public void setHorario(Integer horario) {
        this.horario = horario;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "id=" + id +
                ", codigo='" + codigo + '\'' +
                ", horario=" + horario +
                ", alunos=" + alunos +
                ", professor=" + professor +
                '}';
    }
}
